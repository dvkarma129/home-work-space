package com.decodetech.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decodetech.demo.dto.DepartmentDTO;
import com.decodetech.demo.dto.EmployeDTO;
import com.decodetech.demo.service.DeptService;
import com.decodetech.demo.service.EmpService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/dept")
public class DeptCtrl {

	private final DeptService deptService;

	@PostMapping(value = "/add", headers = "Accept=application/json")
	public void addDept(@RequestBody DepartmentDTO dto) {
		deptService.addDept(dto);
	}
	
	@PostMapping(value = "/viewAll", headers = "Accept=application/json")
	public List<DepartmentDTO> viewAll() {
		return deptService.viewAll();
	}
	
}
