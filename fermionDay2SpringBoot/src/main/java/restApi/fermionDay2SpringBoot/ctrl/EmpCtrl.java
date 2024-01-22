package restApi.fermionDay2SpringBoot.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import restApi.fermionDay2SpringBoot.dto.EmpDto;
import restApi.fermionDay2SpringBoot.repo.EmpRepo;
import restApi.fermionDay2SpringBoot.serv.EmpServ;

@RestController
@AllArgsConstructor
@RequestMapping("/emp")
public class EmpCtrl {

	private final EmpRepo empRepo;
	
	@PostMapping
	public ResponseEntity<EmpDto> addEmp(@RequestBody EmpDto emp){
		EmpDto empDto = empRepo.save(emp);
		return new ResponseEntity<>(empDto,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<EmpDto>> viewEmp(){
		List<EmpDto> empDto = empRepo.findAll();
		return new ResponseEntity<>(empDto,HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<EmpDto> updateEmp(@PathVariable int id,@RequestBody EmpDto empDto){
		Optional<EmpDto> emp = empRepo.findById(id);
		EmpDto existingEmp = emp.get();
		existingEmp.setName(empDto.getName());
		existingEmp.setCity(empDto.getCity());
		
		empRepo.save(existingEmp);
		return new ResponseEntity<EmpDto>(existingEmp, HttpStatus.OK);
	}
	
	
}
