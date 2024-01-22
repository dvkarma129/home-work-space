package com.decodetech.demo.service;

import com.decodetech.demo.dto.StudentDTO;

public interface EmailService {

	String sendMail(StudentDTO studentDTO);

}
