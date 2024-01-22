package com.decodetech.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="STUDENT")
@Getter
@Setter
@ToString
public class StudentDTO {

	@Id
	@Column(name="STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_FNAME")
	private String studentFname;
	
	@Column(name="STUDENT_LNAME")
	private String studentLname;
	
	@Column(name="STUDENT_AGE")
	private int studentAge;
	
	@OneToOne
	@JoinColumn(name="Teacher_id")
	TeacherDTO teacher;
	
	@Transient
	private String teacherName;
}
