package com.demo.REPO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.DTO.StudentDTO;
import com.demo.DTO.TeacherDTO;

@Repository
public interface StudentRepo extends JpaRepository<StudentDTO, Integer>{

	List<StudentDTO> findByTeacher_TeacherFname(TeacherDTO teacher);

	List<StudentDTO> findByStudentId(int studentId);

	List<StudentDTO> findByTeacher_TeacherFnameAndStudentId(TeacherDTO teacher, int studentId);

}
