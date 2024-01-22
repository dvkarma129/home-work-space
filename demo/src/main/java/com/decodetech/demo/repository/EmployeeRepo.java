package com.decodetech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decodetech.demo.dto.EmployeDTO;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeDTO, Integer>{

}
