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

}
