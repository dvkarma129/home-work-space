package com.decodetech.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.decodetech.demo.dao.StudentDAO;
import com.decodetech.demo.dto.StudentDTO;
import com.decodetech.demo.repository.StudentRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentService {
	
	private final StudentRepo studentRepo;
	
	@Transactional
	public StudentDTO addStudent(StudentDTO model) {
		System.out.println("StudentDTO --> " + model.toString());
		StudentDTO dto = new StudentDTO();
		dto.setStudentId(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		dto.setStudentLname(model.getStudentLname());
		dto.setStudentAge(model.getStudentAge());
		dto.setTeacher(model.getTeacher());
		//studentdao.addStudent(model);
		studentRepo.save(dto);
		return dto;
	}

	@Transactional
	public StudentDTO update(StudentDTO model) {
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		studentRepo.save(dto);
		return dto;
	}

	public List<StudentDTO> viewStudent() {
		List<StudentDTO> dto = studentRepo.findAll();
		return dto;
	}

	public List<StudentDTO> viewStudentCondition(StudentDTO model) {
		List<StudentDTO> dto = studentRepo.findByTeacher_TeacherName(model.getTeacherName());
		return dto;
	}

}
