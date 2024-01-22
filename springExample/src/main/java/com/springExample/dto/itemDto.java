package com.springExample.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ITEM_DETAILS")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class itemDto {
	
	@Id
	@GeneratedValue
	private int itemId;
	
	private String itemName;
	
	private int itemPrice;
//	
//	@ManyToOne
//	@JoinColumn(name="catId") 
//	catDto cat;
}
