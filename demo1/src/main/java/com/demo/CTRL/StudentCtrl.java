package com.demo.CTRL;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.DTO.StudentDTO;
import com.demo.SERVICE.StudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentCtrl {
	
	private final StudentService studentService;

	@PostMapping("/add")
	public StudentDTO addStudent(@RequestBody StudentDTO model) {
		System.out.println("Model --> " + model.toString());
		return studentService.addStudent(model);
	}
		
	@PostMapping("/viewby")
	public List<StudentDTO> viewById(@RequestBody StudentDTO model) {
		return studentService.viewById(model);
	}
	
	@PostMapping("/viewTeacher")
	public List<StudentDTO> viewTeacher(@RequestBody StudentDTO model) {
		return studentService.viewTeacher(model);
	}
		
	@PostMapping("/view")
	public List<StudentDTO> viewStudent(@RequestBody StudentDTO model) {
		return studentService.viewStudent(model);
	}
	
	@PostMapping("/update")
	public String updateStudent(@RequestBody StudentDTO model) {
		return studentService.updateStudent(model);
	}
	
	@PostMapping("/delete")
	public String deleteStudent(@RequestBody StudentDTO model) {
		return studentService.deleteStudent(model);
	}
	
	@PostMapping("/addCompltete")
	public StudentDTO addStudentComplete(@RequestBody StudentDTO model) {
		return studentService.addStudentComplete(model);
	}
	
	@PostMapping("/addAddTeach")
	public StudentDTO addNewStudent(@RequestBody StudentDTO model) {
		return studentService.addNewStudent(model);
	}
	
	@PostMapping("/addAdd")
	public StudentDTO addAddress(@RequestBody StudentDTO model) {
		return studentService.addAddress(model);
	}
	
	@PostMapping("/addTeach")
	public StudentDTO addTeach(@RequestBody StudentDTO model) {
		return studentService.addTeach(model);
	}
	
	@PostMapping("/addCourse")
	public StudentDTO addCourse(@RequestBody StudentDTO model) {
		return studentService.addCourse(model);
	}
	
}
