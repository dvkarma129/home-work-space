package com.springExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springExample.dto.itemDto;

@Repository
public interface ItemRepo extends JpaRepository<itemDto, Integer> {

}
