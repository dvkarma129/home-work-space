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
@Table(name="USER_DETAILS")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class userDto {

	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="USER_FNAME")
	private String userFname;
	
	@Column(name="USER_LNAME")
	private String userLname;
	
	@Column(name="USER_BALANCE")
	private int userBalance;
	
	@Column(name="USER_CONTACT")
	private long userContact;
	
	@Column(name="USER_ADDRESS")
	private String userAddress;
	
	@Column(name="USER_USERNAME")
	private String userUsername;
	
	@Column(name="USER_PASSWORD")
	private String userPassword;
	
}
