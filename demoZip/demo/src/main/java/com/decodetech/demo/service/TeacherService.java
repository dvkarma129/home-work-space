package com.decodetech.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.decodetech.demo.dto.TeacherDTO;
import com.decodetech.demo.repository.TeacherRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeacherService {
	
	private final TeacherRepo teacherRepo;

	@Transactional
	public String addTeacher(TeacherDTO model) {
		System.out.println("TeacherDTO --> " + model.toString());
		TeacherDTO dto = new TeacherDTO();
		dto.setTeacheId(model.getTeacheId());
		dto.setTeacherName(model.getTeacherName());
		dto.setTeacherAge(model.getTeacherAge());
		
		teacherRepo.save(dto);
		return "Teacher added succeesfully";
	}

}
