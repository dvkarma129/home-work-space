package com.demo.SERVICE;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.demo.DTO.TeacherDTO;
import com.demo.REPO.StudentRepo;
import com.demo.REPO.TeacherRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeacherService {

	private final TeacherRepo teacherRepo;

	public TeacherDTO addTeacher(TeacherDTO model) {
		TeacherDTO dto = new TeacherDTO();
		dto.setTeacherId(model.getTeacherId());
		dto.setTeacherFname(model.getTeacherFname());
		dto.setTeacherLname(model.getTeacherLname());
		dto.setTeacherAge(model.getTeacherAge());
		
		teacherRepo.save(dto);
		return dto;
	}
	public String updateTeacher(TeacherDTO model) {
		TeacherDTO dto = teacherRepo.getById(model.getTeacherId());
		dto.setTeacherFname(model.getTeacherFname());
		teacherRepo.save(dto);
		return "succesfully updated";
	}
	@Transactional
	public List<TeacherDTO> viewById(TeacherDTO model) {
		List<TeacherDTO> dto = teacherRepo.findByTeacherIdAndTeacherAge(model.getTeacherId(), model.getTeacherAge());
		return dto;
	}
	@Transactional
	public List<TeacherDTO> viewTeacher(TeacherDTO model) {
		List<TeacherDTO> dtos = teacherRepo.findAll();
		return dtos;
	}
	@Transactional
	public String deleteTeacher(TeacherDTO model) {
		TeacherDTO dto = teacherRepo.getById(model.getTeacherId());
		teacherRepo.delete(dto);
		return "succesfully deleted";
	}
}
