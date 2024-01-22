package com.demo.SERVICE;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.demo.DTO.StudentDTO;
import com.demo.REPO.StudentRepo;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

	private final StudentRepo studentRepo;
	
	@Transactional
	public StudentDTO addStudent(StudentDTO model) {
		
		StudentDTO dto = new StudentDTO();
		dto.setStudentId(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		dto.setStudentLname(model.getStudentLname());
		dto.setStudentAge(model.getStudentAge());
		
		studentRepo.save(dto);
		return dto;
	}

	@Transactional
	public String updateStudent(StudentDTO model) {
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		studentRepo.save(dto);
		return "Student succesfully updated";
	}

	@Transactional
	public List<StudentDTO> viewStudent(StudentDTO model) {
		List<StudentDTO> dtos = studentRepo.findAll();
		return dtos;
	}

	@Transactional
	public String deleteStudent(StudentDTO model) {
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		studentRepo.delete(dto);
		return "Student succesfully deleted";
	}

	@Transactional
	public List<StudentDTO> viewById(StudentDTO model) {
		List<StudentDTO> dto = studentRepo.findByStudentId(model.getStudentId());
		return dto;
	}
	
	@Transactional
	public List<StudentDTO> viewTeacher(StudentDTO model) {
		List<StudentDTO> dto = studentRepo.findByTeacher_TeacherFname(model.getTeacher());
		return dto;
	}
	
//	findByTeacher_TeacherName(model.getTeacherName());
	
	@Transactional
	public StudentDTO addStudentComplete(StudentDTO model) {

		StudentDTO dto = new StudentDTO();
		dto.setStudentId(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		dto.setStudentLname(model.getStudentLname());
		dto.setStudentAge(model.getStudentAge());
		dto.setTeacher(model.getTeacher());
		dto.setAddress(model.getAddress());
		dto.setCourse(model.getCourse());
		studentRepo.save(dto);
		return dto;
	}
	
	@Transactional
	public StudentDTO addNewStudent(StudentDTO model) {

		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setTeacher(model.getTeacher());
		dto.setAddress(model.getAddress());
		
		studentRepo.save(dto);
		return dto;
	}

	public StudentDTO addAddress(StudentDTO model) {
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setAddress(model.getAddress());
		
		studentRepo.save(dto);
		return dto;
	}

	public StudentDTO addTeach(StudentDTO model) {
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setTeacher(model.getTeacher());
		
		studentRepo.save(dto);
		return dto;
	}

	public StudentDTO addCourse(StudentDTO model) {
		// TODO Auto-generated method stub
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setCourse(model.getCourse());
		
		studentRepo.save(dto);
		return dto;
	}
	
}
