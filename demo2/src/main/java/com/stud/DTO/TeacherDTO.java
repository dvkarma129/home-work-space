package com.stud.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name ="TEACHER")
public class TeacherDTO {

	@Id
	@Column(name="TEACHER_ID")
	private int teacherId;
	
	@Column(name="TEACHER_NAME")
	private String teacherName;
	
	@Column(name="TEACHER_AGE")
	private int teacherAge;
}
