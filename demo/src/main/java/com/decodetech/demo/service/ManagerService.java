package com.decodetech.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.decodetech.demo.dto.ManagerDTO;
import com.decodetech.demo.repository.ManagerRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ManagerService {
	
	private final ManagerRepo mgrRepo;

	public void addMgr(ManagerDTO dto) {
		ManagerDTO model = new ManagerDTO();
		model.setMgrName(dto.getMgrName());
		mgrRepo.save(model);
	}

	public List<ManagerDTO> viewAll() {
		return mgrRepo.findAll();
	}

}
