package com.decodetech.demo.service;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.decodetech.demo.dto.StudentDTO;
import com.decodetech.demo.repository.StudentRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentService {

	private final StudentRepo studentRepo;
	
	private final EmailService emailService;

	@Transactional
	public StudentDTO addStudent(StudentDTO model) {
		StudentDTO dto = new StudentDTO();
		dto.setStudentFname(model.getStudentFname());
		dto.setStudentLname(model.getStudentLname());
		dto.setStudentAge(model.getStudentAge());
		dto.setStudentGender(model.getStudentGender());
		dto.setStudentAddress(model.getStudentAddress());
		dto.setStudentEmailId(model.getStudentEmailId());
//		dto.setStudentProfilePic(getProfilePicPath(model.getProfilePic()));
		dto.setStudentUsername(model.getStudentUsername());
		dto.setStudentPassword(model.getStudentPassword());
		return studentRepo.save(dto);
		
//		emailService.sendMail(dto);
		
	}

	private String getProfilePicPath(MultipartFile profilePic) {
		String path = "../image/";
		if(!profilePic.isEmpty()) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			try {
				String fileName = profilePic.getOriginalFilename()+timestamp.getTime()+".jpg";
				path = path + fileName;
				File file = new File("E:\\Java\\spring\\demo\\src\\main\\webapp\\image\\"+fileName);
				Files.copy(profilePic.getInputStream(), file.toPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			path = path + "defaultPic.jpg";
		}
		return path;
	}

	public StudentDTO updateStudent(StudentDTO model) {
		StudentDTO dto = studentRepo.getById(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		dto.setStudentLname(model.getStudentLname());
		dto.setStudentAge(model.getStudentAge());
		dto.setStudentGender(model.getStudentGender());
		dto.setStudentAddress(model.getStudentAddress());
		dto.setStudentUsername(model.getStudentUsername());
		dto.setStudentPassword(model.getStudentPassword());
		return studentRepo.save(dto);
	}

	public boolean studentLogin(StudentDTO dto) {
		int count = studentRepo.countByStudentUsernameAndStudentPassword(dto.getStudentUsername(),
				dto.getStudentPassword());
		if (count > 0) {
			return true;
		}
		return false;
	}

	public StudentDTO getStudentData(StudentDTO dto) {
		StudentDTO stdDto = studentRepo.findByStudentUsernameAndStudentPassword(dto.getStudentUsername(),
				dto.getStudentPassword());
		return stdDto;
	}

}
