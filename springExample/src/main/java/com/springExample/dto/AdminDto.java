package com.springExample.dto;

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
@Table(name="ADMIN_DETAILS")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class AdminDto {

	@Id
	@GeneratedValue
	@Column(name="ADMIN_ID")
	private int adminId;
	
	@Column(name="ADMIN_FNAME")
	private String adminFname;
	
	@Column(name="ADMIN_LNAME")
	private String adminLname;
	
	@Column(name="MART_REVENUE")
	private int martRevenue;
	
	@Column(name="ADMIN_USERNAME")
	private String adminUsername;
	
	@Column(name="ADMIN_PASSWORD")
	private String adminPassword;
	
}
