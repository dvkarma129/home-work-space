package com.stud.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name ="Address")
public class AddressDTO {

	@Id
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@Column(name="ADDRESS_CITY")
	private String addressCity;
	
	@Column(name="ADDRESS_STATE")
	private String addressState;
	
	@Column(name="ADDRESS_COUNTRY")
	private String addressCountry;
	
}
