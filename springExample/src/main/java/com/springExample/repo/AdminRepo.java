package com.springExample.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springExample.dto.AdminDto;

@Repository
public interface AdminRepo extends JpaRepository<AdminDto, Integer> {

	int countByAdminUsernameAndAdminPassword(String adminUsername, String adminPassword);

}
