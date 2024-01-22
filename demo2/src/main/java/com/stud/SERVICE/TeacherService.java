//package com.stud.SERVICE;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.demo.DTO.StudentDTO;
//import com.demo.DTO.TeacherDTO;
//import com.demo.REPO.TeacherRepo;
//
//import java.util.List;
//
//import lombok.AllArgsConstructor;
//
//@Service
//@AllArgsConstructor
//public class TeacherService {
//	
//	private final TeacherRepo teacherRepo;
//
//
//	@Transactional
//	public String addTeacher(TeacherDTO model) {
//		TeacherDTO dto = new TeacherDTO();
//		dto.setTeacherId(model.getTeacherId());
//		dto.setTeacherName(model.getTeacherName());
//		dto.setTeacherAge(model.getTeacherAge());
//		teacherRepo.save(dto);
//		return "Teacher added successfully";
//	}
//	
//	@Transactional
//	public List<TeacherDTO> viewTeacher(TeacherDTO model){
//		List<TeacherDTO> dtos = teacherRepo.findAll();
//		return dtos;
//	}
//	
//	@Transactional
//	public String updateTeacher(TeacherDTO model) {
//		TeacherDTO dto = teacherRepo.getById(model.getTeacherId());
//		dto.setTeacherName(model.getTeacherName());
//		teacherRepo.save(dto);
//		return"Updated succesfully";
//	}
//
//	public String deleteTeacher(TeacherDTO model) {
//		TeacherDTO dto = teacherRepo.getById(model.getTeacherId());
//		teacherRepo.delete(dto);
//		return "Deleted sucessfully";
//	}
//
//	public List<TeacherDTO> viewById(TeacherDTO model) {
//		List<TeacherDTO> dtos = teacherRepo.findByTeacherIdAndTeacherAge(model.getTeacherId(), model.getTeacherAge());
//		return dtos;
//	}
//
//}
