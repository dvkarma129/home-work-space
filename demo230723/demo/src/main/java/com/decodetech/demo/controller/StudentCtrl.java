package com.decodetech.demo.controller;

import java.awt.dnd.DropTargetContext;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.decodetech.demo.dto.StudentDTO;
import com.decodetech.demo.dto.TeacherDTO;
import com.decodetech.demo.repository.StudentRepo;
import com.decodetech.demo.repository.TeacherRepo;
import com.decodetech.demo.service.StudentService;
import com.decodetech.demo.service.WorkbookGenerator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/student")
@RestController
public class StudentCtrl {
	
	private final StudentService studentService;
	
	private final WorkbookGenerator workbookGenerator;
	
	private final StudentRepo studentRepo;
	
	private final TeacherRepo teacherRepo;
	
	@GetMapping("/getStudentForm")
    public String getForm() {
        return "studentForm";
    }
	
	@GetMapping("/login")
    public String login() {
        return "login";
    }

	@PostMapping(value="/add", headers = "Accept=application/json")
	public StudentDTO addStudent(@RequestBody StudentDTO model) {
		return studentService.addStudent(model);
	}
	
	@GetMapping("logout") 
		public String logout() {
			return "login";
		}
	
	@GetMapping("/view")
	public ModelAndView viewStudent() {
		
		ModelMap map = new ModelMap();
		
		 List<StudentDTO> stdDto = studentRepo.findAll();
		 List<TeacherDTO> teaDto = teacherRepo.findAll();
		 
		 System.out.println("stdDto --> " + stdDto);
		 System.out.println("teaDto --> " + teaDto);
		 
		map.addAttribute("stdDto", stdDto);
		map.addAttribute("teaDto", teaDto);
		
		System.out.println("map --> " + map);
		 
		 return new ModelAndView("viewStudentData","student",map);
	}
	
	@GetMapping("/views")
	public List<StudentDTO> viewStudents() {
		
//		ModelMap map = new ModelMap();
//		
//		 List<StudentDTO> stdDto = studentRepo.findAll();
//		 List<TeacherDTO> teaDto = teacherRepo.findAll();
//		 
//		 System.out.println("stdDto --> " + stdDto);
//		 System.out.println("teaDto --> " + teaDto);
//		 
//		map.addAttribute("stdDto", stdDto);
//		map.addAttribute("teaDto", teaDto);
//		
//		System.out.println("map --> " + map);
//		 
//		 return new ModelAndView("viewStudentData","student",map);
		return studentRepo.findAll();
	}
	
	@GetMapping("/updateStudent")
	public ModelAndView updateStudent (@RequestParam int studentId) {
		StudentDTO dto = studentRepo.getById(studentId);
		return new ModelAndView("updateStudent","student",dto);
	}
	
	@PostMapping("/update")
	public StudentDTO updateStudent(@RequestBody StudentDTO model) {
		return studentService.updateStudent(model);
	}
	
	@GetMapping(value = "/deleteStudent/{studentId}", headers = "Accept=application/json")
	public void deleteStudent(@PathVariable("studentId")  int studentId) {
		  studentRepo.deleteById(studentId);
//		 ModelMap map = new ModelMap();
//		 List<StudentDTO> stdDto = studentRepo.findAll();
//		 List<TeacherDTO> teaDto = teacherRepo.findAll();
//		 map.addAttribute("stdDto", stdDto);
//			map.addAttribute("teaDto", teaDto);
//		 return new ModelAndView("viewStudentData","student",map);
	}
	
	@PostMapping("/studentLogin")
	public ModelAndView studentLogin (@ModelAttribute StudentDTO dto) {
		boolean valid = studentService.studentLogin(dto);
		StudentDTO stdDto = new StudentDTO();
		if(valid) {
			stdDto = studentService.getStudentData(dto);
			return new ModelAndView("success","student",stdDto);
		}
		return new ModelAndView("failure","student",stdDto);
	}
	
	@GetMapping("/generateWorkbook")
	public ModelAndView generateWorkbook () throws IOException {
		workbookGenerator.downloadData();
		List<StudentDTO> dto = studentRepo.findAll();
		return new ModelAndView("viewStudentData","student",dto);
	}
	
	@PostMapping("/insertWorkbookData")
	public String insertWorkbookData (@RequestParam("file") MultipartFile file) throws IOException {
		workbookGenerator.insertWorkbookData(file);
		return "login";
	}
	
	@GetMapping("fileUpload") 
	public String fileUpload() {
		return "Excel";
	}
}
