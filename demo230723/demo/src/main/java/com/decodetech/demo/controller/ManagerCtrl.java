package com.decodetech.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decodetech.demo.dto.EmployeDTO;
import com.decodetech.demo.dto.ManagerDTO;
import com.decodetech.demo.service.ManagerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/mgr")
@RestController
public class ManagerCtrl {

	private final ManagerService mgrService;
	
	@PostMapping(value = "/add", headers = "Accept=application/json")
	public void addMgr(@RequestBody ManagerDTO dto) {
		mgrService.addMgr(dto);
	}
	
	@PostMapping(value = "/viewAll", headers = "Accept=application/json")
	public List<ManagerDTO> viewAll() {
		return mgrService.viewAll();
	}
}
