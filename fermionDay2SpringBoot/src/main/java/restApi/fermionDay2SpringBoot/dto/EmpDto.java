package restApi.fermionDay2SpringBoot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmpDto {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String city;
}
