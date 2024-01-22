package com.decodetech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decodetech.demo.dto.DepartmentDTO;

@Repository
public interface DeptRepo extends JpaRepository<DepartmentDTO, Integer>{

}
