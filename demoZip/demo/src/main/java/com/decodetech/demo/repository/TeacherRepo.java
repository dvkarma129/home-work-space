package com.decodetech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decodetech.demo.dto.TeacherDTO;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherDTO, Integer> {

}
