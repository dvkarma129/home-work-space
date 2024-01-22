package com.decodetech.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@GeneratedValue
	@Column(name="Teacher_ID")
	private int teacherId;
	
	@Column(name="Teacher_Name")
	private String teacherName;
	
	@Column(name="Teacher_Age")
	private int teacherAge;
	
	
}
