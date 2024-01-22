package com.springExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springExample.dto.catDto;

@Repository
public interface CatRepo extends JpaRepository<catDto, Integer>{

}
