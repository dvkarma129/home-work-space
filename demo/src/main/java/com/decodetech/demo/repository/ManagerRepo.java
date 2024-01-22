package com.decodetech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decodetech.demo.dto.ManagerDTO;

@Repository
public interface ManagerRepo extends JpaRepository<ManagerDTO, Integer>{

}
