//package com.stud.SERVICE;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.demo.DTO.AddressDTO;
//import com.demo.DTO.StudentDTO;
//import com.demo.DTO.TeacherDTO;
//import com.demo.REPO.StudentRepo;
//
//import lombok.AllArgsConstructor;
//
//@Service
//@AllArgsConstructor
//public class StudentService {
//
//	private final StudentRepo studentRepo;
//	
//	@Transactional
//	public StudentDTO addStudent(StudentDTO model) {
//		
//		StudentDTO dto = new StudentDTO();
//		dto.setStudentId(model.getStudentId());
//		dto.setStudentFname(model.getStudentFname());
//		dto.setStudentLname(model.getStudentLname());
//		dto.setStudentAge(model.getStudentAge());
//
////		TeacherDTO tdto = new TeacherDTO();
////		tdto.setTeacherId(model.getTeacher().getTeacherId());
////		tdto.setTeacherName(model.getTeacher().getTeacherName());
////		tdto.setTeacherAge(model.getTeacher().getTeacherAge());
////		dto.setTeacher(tdto);
////		
////		AddressDTO adto = new AddressDTO();
////		adto.setAddressId(model.getAddress().getAddressId());
////		adto.setAddressCity(model.getAddress().getAddressCity());
////		adto.setAddressState(model.getAddress().getAddressState());
////		adto.setAddressCountry(model.getAddress().getAddressCountry());
////		dto.setAddress(adto);
//		
//		studentRepo.save(dto);
//		return dto;
//	}
//
//	@Transactional
//	public String updateStudent(StudentDTO model) {
//		StudentDTO dto = studentRepo.getById(model.getStudentId());
//		dto.setStudentFname(model.getStudentFname());
//		studentRepo.save(dto);
//		return "Student succesfully updated";
//	}
//
//	@Transactional
//	public List<StudentDTO> viewStudent(StudentDTO model) {
//		List<StudentDTO> dtos = studentRepo.findAll();
//		return dtos;
//	}
//
//	@Transactional
//	public String deleteStudent(StudentDTO model) {
//		StudentDTO dto = studentRepo.getById(model.getStudentId());
//		studentRepo.delete(dto);
//		return "Student succesfully deleted";
//	}
//
//	@Transactional
//	public List<StudentDTO> viewById(StudentDTO model) {
//		List<StudentDTO> dto = studentRepo.findByStudentIdAndStudentAge(model.getStudentId(), model.getStudentAge());
//		return dto;
//	}
//	
//	@Transactional
//	public StudentDTO addStudentComplete(StudentDTO model) {
//
//		StudentDTO dto = new StudentDTO();
//		dto.setStudentId(model.getStudentId());
//		dto.setStudentFname(model.getStudentFname());
//		dto.setStudentLname(model.getStudentLname());
//		dto.setStudentAge(model.getStudentAge());
//		dto.setTeacher(model.getTeacher());
//		dto.setAddress(model.getAddress());
//		studentRepo.save(dto);
//		return dto;
//	}
//	
//	@Transactional
//	public StudentDTO addNewStudent(StudentDTO model) {
//
//		StudentDTO dto = studentRepo.getById(model.getStudentId());
//		dto.setTeacher(model.getTeacher());
//		dto.setAddress(model.getAddress());
//		
//		studentRepo.save(dto);
//		return dto;
//	}
//}
