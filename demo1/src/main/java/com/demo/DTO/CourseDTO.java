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
@Table(name="COURSE")
@Getter
@Setter
@ToString
public class CourseDTO {

	@Id
	@Column(name="COURSE_ID")
	private int courseId;
	
	@Column(name="COURSE_NAME")
	private String courseCity;
	
	@Column(name="COURSE_DURATION")
	private String courseState;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="TEACHER_ID")
	private TeacherDTO teacher;
}
