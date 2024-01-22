package com.decodetech.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decodetech.demo.dto.EmployeDTO;
import com.decodetech.demo.service.EmpService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/emp")
public class EmployeeCtrl {

	private final EmpService empservice;

	@PostMapping(value = "/add", headers = "Accept=application/json")
	public void addEmp(@RequestBody EmployeDTO dto) {
		empservice.addEmp(dto);
	}
	
	@PostMapping(value = "/viewAll", headers = "Accept=application/json")
	public List<EmployeDTO> viewAll() {
		return empservice.viewAll();
	}
}
