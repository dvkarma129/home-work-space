package com.demo.SERVICE;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.demo.DTO.AddressDTO;
import com.demo.REPO.AddRepo;
import com.demo.REPO.StudentRepo;
import com.demo.REPO.TeacherRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddService {

	private final AddRepo addRepo;

	public AddressDTO addAdd(AddressDTO model) {
		AddressDTO dto = new AddressDTO();
		dto.setAddId(model.getAddId());
		dto.setAddCity(model.getAddCity());
		dto.setAddState(model.getAddState());
		dto.setAddCountry(model.getAddCountry());
		
		addRepo.save(dto);
		return dto;
	}
	public String updateAdd(AddressDTO model) {
		AddressDTO dto = addRepo.getById(model.getAddId());
		dto.setAddState(model.getAddState());
		addRepo.save(dto);
		return "succesfully updated";
	}
	
	@Transactional
	public List<AddressDTO> viewAdd(AddressDTO model) {
		List<AddressDTO> dtos = addRepo.findAll();
		return dtos;
	}
	@Transactional
	public String deleteAdd(AddressDTO model) {
		AddressDTO dto = addRepo.getById(model.getAddId());
		addRepo.delete(dto);
		return "succesfully deleted";
	}
}
