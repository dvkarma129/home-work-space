package com.decodetech.demo.service;

import java.util.List;

import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;
import org.springframework.stereotype.Service;

import com.decodetech.demo.dto.EmployeDTO;
import com.decodetech.demo.repository.EmployeeRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmpService {
	
	private final EmployeeRepo empRepo;
	
	public void addEmp(EmployeDTO model) {
		EmployeDTO dto = new EmployeDTO();
		dto.setEmpName(model.getEmpName());
		dto.setEmpAge(model.getEmpAge());
		dto.setDept(model.getDept());
		dto.setMgr(model.getMgr());
		empRepo.save(dto);
	}

	public List<EmployeDTO> viewAll() {
		return empRepo.findAll();
	}

}
