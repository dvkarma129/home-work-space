package com.decodetech.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decodetech.demo.dto.TeacherDTO;
import com.decodetech.demo.service.TeacherService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/teacher")
@RestController
public class teacherCtrl {

	private final TeacherService teacherService;
	
	@PostMapping("/add")
	public String addTeacher(@RequestBody TeacherDTO model) {
		return teacherService.addTeacher(model);
	}
}
