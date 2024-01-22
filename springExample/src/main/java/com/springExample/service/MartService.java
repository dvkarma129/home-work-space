package com.springExample.service;

import org.springframework.stereotype.Service;

import com.springExample.dto.AdminDto;
import com.springExample.dto.catDto;
import com.springExample.dto.itemDto;
import com.springExample.dto.userDto;
import com.springExample.repo.AdminRepo;
import com.springExample.repo.CatRepo;
import com.springExample.repo.ItemRepo;
import com.springExample.repo.MartRepo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MartService {
	int userId=0;
	String userFname=" ";
	String userLname=" ";
	int userBalance=0;
	String userUsername=" ";
	String userPassword=" ";

	String itemName=" ";
	int itemPrice=0;
		
	private final MartRepo martRepo;
	private final ItemRepo itemRepo;
	private final CatRepo catRepo;
	private final AdminRepo adminRepo;
	
	public boolean userLogin(userDto model) {
		
		int count = martRepo.countByUserUsernameAndUserPassword(model.getUserUsername(),model.getUserPassword());
		if (count > 0) {
			return true;
		}
		return false;
	}

	public userDto getUserData(userDto model) {
		userDto dto = martRepo.findByUserUsernameAndUserPassword(model.getUserUsername(), model.getUserPassword());
		userId = dto.getUserId();
		userFname=dto.getUserFname();
		userLname=dto.getUserLname();
		userBalance=dto.getUserBalance();
		userUsername=dto.getUserUsername();
		userPassword=dto.getUserPassword();
		return dto;
	}

	public void newUser(userDto model) {
		userDto dto = new userDto();
		dto.setUserFname(model.getUserFname());
		dto.setUserLname(model.getUserLname());
		dto.setUserContact(model.getUserContact());
		dto.setUserAddress(model.getUserAddress());
		dto.setUserUsername(model.getUserUsername());
		dto.setUserPassword(model.getUserPassword());
		martRepo.save(dto);
	}

	public boolean adminLogin(AdminDto model) {
		int count = adminRepo.countByAdminUsernameAndAdminPassword(model.getAdminUsername(),model.getAdminPassword());
		if(count>0) {
			return true;
		}
		return false;
	}

	public void getItemDetails(itemDto imodel) {
		// TODO Auto-generated method stub
		itemDto idto = new itemDto();
		idto.getItemId();
	}

	public void updateProduct(itemDto model) {
		itemDto idto = itemRepo.getById(model.getItemId());
		idto.setItemName(model.getItemName());
		idto.setItemPrice(model.getItemPrice());
		itemRepo.save(idto);
	}

	public void addProduct(itemDto model) {
		itemDto idto = new itemDto();
		idto.setItemName(model.getItemName());
		idto.setItemPrice(model.getItemPrice());
		itemRepo.save(idto);
	}

	public void addCat(catDto model) {
		catDto cdto = new catDto();
		cdto.setCatName(model.getCatName());
		catRepo.save(cdto);
	}

	public void updateCat(catDto model) {
		catDto cdto = catRepo.getById(model.getCatId());
		cdto.setCatName(model.getCatName());
		catRepo.save(cdto);
	}

	public void addBalance(userDto model, int userId) {
		userDto udto = martRepo.getById(userId);
		udto.setUserBalance(model.getUserBalance());
		martRepo.save(udto);
		
	}

}
