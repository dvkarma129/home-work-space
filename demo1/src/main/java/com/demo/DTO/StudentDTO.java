package com.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TEACHER_ID")
	private TeacherDTO teacher;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="ADDRESS_ID")
	private AddressDTO address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="COURSE_ID")
	private CourseDTO course;

}
