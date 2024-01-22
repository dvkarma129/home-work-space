package com.decodetech.demo.controller;

import java.awt.dnd.DropTargetContext;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.decodetech.demo.dto.StudentDTO;
import com.decodetech.demo.repository.StudentRepo;
import com.decodetech.demo.service.StudentService;
import com.decodetech.demo.service.WorkbookGenerator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/student")
@Controller
public class StudentCtrl {
	
	private final StudentService studentService;
	
	private final WorkbookGenerator workbookGenerator;
	
	private final StudentRepo studentRepo;
	
	@GetMapping("/getStudentForm")
    public String getForm() {
        return "studentForm";
    }
	
	@GetMapping("/login")
    public String login() {
        return "login";
    }

	@PostMapping("/add")
	public String addStudent(@ModelAttribute StudentDTO model) {
		studentService.addStudent(model);
		return "login";
	}
	
	@GetMapping("logout") 
		public String logout() {
			return "login";
		}
	
	@GetMapping("/view")
	public ModelAndView viewStudent() {
		 List<StudentDTO> dto = studentRepo.findAll();
		 return new ModelAndView("viewStudentData","student",dto);
	}
	
	@GetMapping("/updateStudent")
	public ModelAndView updateStudent (@RequestParam int studentId) {
		StudentDTO dto = studentRepo.getById(studentId);
		return new ModelAndView("updateStudent","student",dto);
	}
	
	@PostMapping("/update")
	public ModelAndView updateStudent(@ModelAttribute StudentDTO model) {
		studentService.updateStudent(model);
		List<StudentDTO> dto = studentRepo.findAll();
		return new ModelAndView("viewStudentData","student",dto);
	}
	
	@GetMapping("/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam int studentId) {
		 studentRepo.deleteById(studentId);
		 List<StudentDTO> dto = studentRepo.findAll();
		 return new ModelAndView("viewStudentData","student",dto);
	}
	
	@PostMapping("/studentLogin")
	public ModelAndView studentLogin (@ModelAttribute StudentDTO dto) {
		boolean valid = studentService.studentLogin(dto);
		StudentDTO stdDto = new StudentDTO();
		if(valid) {
			stdDto = studentService.getStudentData(dto);
			return new ModelAndView("success","student",stdDto);
		}
		return new ModelAndView("failure","student",stdDto);
	}
	
	@GetMapping("/generateWorkbook")
	public ModelAndView generateWorkbook () throws IOException {
		workbookGenerator.downloadData();
		List<StudentDTO> dto = studentRepo.findAll();
		return new ModelAndView("viewStudentData","student",dto);
	}
	
	@PostMapping("/insertWorkbookData")
	public String insertWorkbookData (@RequestParam("file") MultipartFile file) throws IOException {
		workbookGenerator.insertWorkbookData(file);
		return "login";
	}
	
	@GetMapping("fileUpload") 
	public String fileUpload() {
		return "Excel";
	}
}
