package com.springExample.ctrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springExample.dto.AdminDto;
import com.springExample.dto.catDto;
import com.springExample.dto.itemDto;
import com.springExample.dto.userDto;
import com.springExample.repo.CatRepo;
import com.springExample.repo.ItemRepo;
import com.springExample.repo.MartRepo;
import com.springExample.service.MartService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/mart")
@Controller
public class MartCtrl {
	
	String userFname=" ";
	String userLname=" ";
	int userBalance=0;
	int userId=0;
	String userUsername=" ";
	String userPassword=" ";

	String itemName=" ";
	int itemPrice=0;
	int itemId=0;
	
	private final MartService martService;
	private final MartRepo martRepo;
	private final ItemRepo itemRepo;
	private final CatRepo catRepo;
	boolean validAdmin;

	@GetMapping("/getLogin")
	public String getLogin() {
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView studentLogin(@ModelAttribute userDto model) {
		boolean valid = martService.userLogin(model);
		userDto dto = new userDto();
		if (valid) {
			dto = martService.getUserData(model);
			userId=dto.getUserId();
			userFname=dto.getUserFname();
			userLname=dto.getUserLname();
			userBalance=dto.getUserBalance();
			userUsername=dto.getUserUsername();
			userPassword=dto.getUserPassword();
			return new ModelAndView("home", "user", dto);
		}
		return new ModelAndView("loginFail", "user", dto);
	}

	@GetMapping("/getProducts")
	public ModelAndView getProducts(@ModelAttribute itemDto model) {
		List<Object> obj = new ArrayList<Object>();
		List<itemDto> idto = itemRepo.findAll();
		userDto udto = martRepo.getById(userId); 
		obj.add(idto);
		obj.add(udto);
		System.out.println("obj ------> " + obj);
		return new ModelAndView("getProducts", "i", obj);
	}

	@GetMapping("/getNewUser")
	public String getNewUser() {
		return "newUser";
	}

	@PostMapping("/newUser")
	public String newUser(@ModelAttribute userDto model) {
		martService.newUser(model);
		return "login";
	}

	@GetMapping("/getUserDetails")
	public ModelAndView getUserDetails(@ModelAttribute userDto model) {
		userDto dto = martService.getUserData(model);
		return new ModelAndView("userDetails", "user", dto);
	}

	@GetMapping("/home")
	public String home() {
		return ("home");
	}
	
	@GetMapping("/buyProduct")
	public String buyProduct(@RequestParam int ItemId) {
		itemDto idto = itemRepo.getById(ItemId);
		ItemId=idto.getItemId();
		itemName=idto.getItemName();
		itemPrice=idto.getItemPrice();
		
	    userBalance = userBalance-itemPrice;
	    userDto udto = martRepo.getById(userId); 
	    udto.setUserBalance(userBalance);
	    martRepo.save(udto);
		return "buyProduct";
	}
	
	@GetMapping("/addNewBalance")
	public String addBalance() {
		return ("addNewBalance");
	}

	@PostMapping("/addBalance")
	public String addBalance(@ModelAttribute userDto model) {
		martService.addBalance(model,userId);
		return "addNewBalance";
	}
	
	// ADMIN SIDE
	@GetMapping("/getAdminLogin")
	public String adminLogin() {
		return "adminLogin";
	}

	@PostMapping("/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute AdminDto model) {
		validAdmin = martService.adminLogin(model);
		AdminDto adto = new AdminDto();
		if (validAdmin) {
			return new ModelAndView("adminPage", "admin", adto);
		}
		return new ModelAndView("loginFail", "admin", adto);
	}

	@GetMapping("/manageItems")
	public ModelAndView manageItems(@ModelAttribute itemDto model) {
		List<itemDto> idto = itemRepo.findAll();
	
//		walaet
//		obj.walletadd()
		
		return new ModelAndView("manageItems", "i", idto);
	}

	@GetMapping("/manageUsers")
	public ModelAndView manageUsers(@ModelAttribute userDto model) {
		List<userDto> udto = martRepo.findAll();
		return new ModelAndView("manageUsers", "u", udto);
	}

	@GetMapping("/manageCat")
	public ModelAndView manageCat(@ModelAttribute catDto model) {
		List<catDto> cdto = catRepo.findAll();
		return new ModelAndView("manageCat", "c", cdto);
	}

	@GetMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam int ItemId) {
		itemDto idto = itemRepo.getById(ItemId);
		return new ModelAndView("updateProduct", "i", idto);
	}

	@PostMapping("/update")
	public ModelAndView updateProduct(@ModelAttribute itemDto model) {
		martService.updateProduct(model);
		List<itemDto> idto = itemRepo.findAll();
		return new ModelAndView("manageItems", "i", idto);
	}

	@GetMapping("/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam int ItemId) {
		itemRepo.deleteById(ItemId);
		List<itemDto> idto = itemRepo.findAll();
		return new ModelAndView("manageItems", "i", idto);
	}

	@GetMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam int UserId) {
		martRepo.deleteById(UserId);
		List<userDto> udto = martRepo.findAll();
		return new ModelAndView("manageUsers", "u", udto);
	}

	@GetMapping("/adminPage")
	public String adminPage() {
		return ("adminPage");
	}

	@GetMapping("/addNewProduct")
	public String addNewProduct() {
		return ("addProduct");
	}

	@PostMapping("/addProduct")
	public ModelAndView addProduct(@ModelAttribute itemDto model) {
		martService.addProduct(model);
		List<itemDto> idto = itemRepo.findAll();
		return new ModelAndView("manageItems", "i", idto);
	}

	@GetMapping("/addNewCat")
	public String addNewCat() {
		return ("addCat");
	}

	@PostMapping("/addCat")
	public ModelAndView addCat(@ModelAttribute catDto model) {
		martService.addCat(model);
		List<catDto> cdto = catRepo.findAll();
		return new ModelAndView("manageCat", "c", cdto);
	}

	@GetMapping("/updateCat")
	public ModelAndView updateCat(@RequestParam int CatId) {
		catDto cdto = catRepo.getById(CatId);
		return new ModelAndView("updateCat", "c", cdto);
	}

	@PostMapping("/updateCatt")
	public ModelAndView updateCat(@ModelAttribute catDto model) {
		martService.updateCat(model);
		List<catDto> cdto = catRepo.findAll();
		return new ModelAndView("manageCat", "c", cdto);
	}

	@GetMapping("/deleteCat")
	public ModelAndView deleteCat(@RequestParam int CatId) {
		catRepo.deleteById(CatId);
		List<catDto> cdto = catRepo.findAll();
		return new ModelAndView("manageCat", "c", cdto);
	}
	

}
