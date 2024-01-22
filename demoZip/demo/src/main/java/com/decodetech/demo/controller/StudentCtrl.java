package com.decodetech.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decodetech.demo.dto.StudentDTO;
import com.decodetech.demo.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentCtrl {
	
	
	private final StudentService studentService;

	@PostMapping("/add")
	public StudentDTO addStudent(@RequestBody StudentDTO model) {
		System.out.println("model --> " + model.toString());
		return studentService.addStudent(model);
	}
	
	@PostMapping("/update")
	public StudentDTO updateStudent(@RequestBody StudentDTO model) {
		return studentService.update(model);
	}
//	
//	@PostMapping("/delete")
//	public String deleteStudent(@RequestBody StudentDTO model) {
////		return loginLogoutService.userLogin(model);
//	}
//	
	@PostMapping("/view")
	public List<StudentDTO> viewStudent() {
		return studentService.viewStudent();
	}
	
	@PostMapping("/viewCondition")
	public List<StudentDTO> viewStudentCondition(@RequestBody StudentDTO model) {
		return studentService.viewStudentCondition(model);
	}
}
