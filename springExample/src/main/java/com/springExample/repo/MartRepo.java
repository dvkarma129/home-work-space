package com.springExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springExample.dto.userDto;

@Repository
public interface MartRepo extends JpaRepository<userDto, Integer>{

	int countByUserUsernameAndUserPassword(String userUsername, String userPassword);

	userDto findByUserUsernameAndUserPassword(String userUsername, String userPassword);

}
