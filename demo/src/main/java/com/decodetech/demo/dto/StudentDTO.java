package com.decodetech.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="STUDENT_DETAILS")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class StudentDTO {

	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_FNAME")
	private String studentFname;
	
	@Column(name="STUDENT_LNAME")
	private String studentLname;
	
	@Column(name="STUDENT_AGE")
	private int studentAge;
	
	@Column(name="STUDENT_GENDER")
	private String studentGender;
	
	@Column(name="STUDENT_ADDRESS")
	private String studentAddress;
	
	@Column(name="STUDENT_USERNAME")
	private String studentUsername;
	
	@Column(name="STUDENT_PASSWORD")
	private String studentPassword;
	
	@Column(name="STUDENT_PROFILE_PIC")
	private String studentProfilePic;
	
	@Transient
	MultipartFile profilePic;
	
}
