package com.decodetech.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="EMPLOYEE")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class EmployeDTO {

	@Id
	@GeneratedValue
	@Column(name="EMP_ID")
	private int empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_AGE")
	private int empAge;
	
	@OneToOne
	@JoinColumn(name="DEPT_ID")
	private DepartmentDTO dept;
	
	@OneToOne
	@JoinColumn(name="MGR_ID")
	private ManagerDTO mgr;
	
	
}