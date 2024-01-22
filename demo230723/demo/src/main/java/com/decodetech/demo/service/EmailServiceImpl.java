package com.decodetech.demo.service;

import java.util.Date;
import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.decodetech.demo.dto.StudentDTO;

@Service
public class EmailServiceImpl implements EmailService {
	
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}") private String sender;
	
	@Autowired
    public EmailServiceImpl (JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

	@Override
	public String sendMail(StudentDTO studentDTO) {
//		Random rnd = new Random();
//	    int number = rnd.nextInt(999999);
//	    String userOtp = String.format("%06d", number);
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append("<html><head><title> Student Registration </title></head><body><table style=\"border: 1px solid black;\"><tr style=\"border: 1px solid black;\"><th style=\"border: 1px solid black;\"> Name </th><th style=\"border: 1px solid black;\"> User Name </th></tr><tr style=\"border: 1px solid black;\"><td style=\"border: 1px solid black;\"> " + studentDTO.getStudentFname() + " " + studentDTO.getStudentLname() + " </td><td style=\"border: 1px solid black;\"> " + studentDTO.getStudentUsername() + " </td></tr></table></body></html>\r\n");
	    
	    try {
	    	
	    	MimeMessagePreparator preparator = new MimeMessagePreparator() {
	    		
	    		 @Override
	             public void prepare (MimeMessage mimeMessage) throws Exception {
	                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, false, "utf-8");
	                 messageHelper.setTo(studentDTO.getStudentEmailId());
	                 messageHelper.setSentDate(new Date());
	                 messageHelper.setFrom(sender);
	                 messageHelper.setSubject("Registration Status");
	                 messageHelper.setText("Welcome, you are sucessfully regeister");
	                 mimeMessage.setContent(sb.toString(), "text/html");
	             }
	    	};
	    	
	    	this.javaMailSender.send(preparator);
	    	
	    } catch (Exception ex) {
	    	ex.printStackTrace();
	    }

//	    return userOtp;
	    return "Student Successfully Register";
	}

}
