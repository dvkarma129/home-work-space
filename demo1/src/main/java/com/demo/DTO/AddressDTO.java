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
@Table(name="ADDRESS")
@Getter
@Setter
@ToString
public class AddressDTO {

	@Id
	@Column(name="ADDRESS_ID")
	private int addId;
	
	@Column(name="ADDRESS_CITY")
	private String addCity;
	
	@Column(name="ADDRESS_STATE")
	private String addState;
	 
	@Column(name="ADDRESS_COUNTRY")
	private String addCountry;

}
