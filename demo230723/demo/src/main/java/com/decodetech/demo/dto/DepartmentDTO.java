package com.decodetech.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="DEPARTMENT")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class DepartmentDTO {

	@Id
	@GeneratedValue
	@Column(name="DEPT_ID")
	private int deptId;
	
	@Column(name="DEPT_NAME")
	private String deptName;
	
}
