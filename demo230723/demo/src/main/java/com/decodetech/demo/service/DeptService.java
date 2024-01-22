package com.decodetech.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.decodetech.demo.dto.DepartmentDTO;
import com.decodetech.demo.repository.DeptRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DeptService {
	
	private final DeptRepo deptRepo;
	
	public void addDept(DepartmentDTO dto) {
		DepartmentDTO model = new DepartmentDTO();
		model.setDeptName(dto.getDeptName());
		deptRepo.save(model);
	}

	public List<DepartmentDTO> viewAll() {
		return deptRepo.findAll();
	}

}
