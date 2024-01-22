package com.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="TEACHER")
@Getter
@Setter
@ToString
public class TeacherDTO {

	@Id
	@Column(name="TEACHER_ID")
	private int teacherId;
	
	@Column(name="TEACHER_FNAME")
	private String teacherFname;
	
	@Column(name="TEACHER_LNAME")
	private String teacherLname;
	 
	@Column(name="TEACHER_AGE")
	private int teacherAge;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="ADDRESS_ID")
	private AddressDTO address;
}
