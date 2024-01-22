//package com.stud.CTRL;
//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.DTO.StudentDTO;
//import com.demo.DTO.TeacherDTO;
//import com.demo.SERVICE.TeacherService;
//
//import lombok.AllArgsConstructor;
//
//@RestController
//@RequestMapping("/teacher")
//@AllArgsConstructor
//public class TeacherCtrl {
//
//	private final TeacherService teacherService;
//	
//	@PostMapping("/add")
//	public String addTeacher(@RequestBody TeacherDTO model) {
//		System.out.println("Model --> " + model.toString());
//		return teacherService.addTeacher(model);
//	}
//	
//	@PostMapping("view")
//	public List<TeacherDTO> viewTeacher(@RequestBody TeacherDTO model) {
//		return teacherService.viewTeacher(model);
//	}
//	
//	@PostMapping("update")
//	public String updateTeacher(@RequestBody TeacherDTO model) {
//		return teacherService.updateTeacher(model);
//	}
//	
//	@PostMapping("delete")
//	public String deleteTeacher(@RequestBody TeacherDTO model) {
//		return teacherService.deleteTeacher(model);
//	}
//	
//	@PostMapping("/viewby")
//	public List<TeacherDTO> viewById(@RequestBody TeacherDTO model) {
//		return teacherService.viewById(model);
//	}
//}
