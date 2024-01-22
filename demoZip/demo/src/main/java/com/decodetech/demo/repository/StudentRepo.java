package com.decodetech.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decodetech.demo.dto.StudentDTO;

@Repository
public interface StudentRepo extends JpaRepository<StudentDTO, Integer>
 {

	List<StudentDTO> findByStudentAgeAndStudentLname(int studentAge, String studentLname);

	List<StudentDTO> findByTeacher_TeacherName(String teacherName);

 }
