package com.demo.CTRL;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.DTO.AddressDTO;
import com.demo.SERVICE.AddService;
import com.demo.SERVICE.TeacherService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddCtrl {

	private final AddService addService;

	@PostMapping("/add")
	public AddressDTO addAdd(@RequestBody AddressDTO model) {
		System.out.println("Model --> " + model.toString());
		return addService.addAdd(model);
	}

	@PostMapping("/update")
	public String updateAdd(@RequestBody AddressDTO model) {
		return addService.updateAdd(model);
	}

	@PostMapping("/view")
	public List<AddressDTO> viewAdd(@RequestBody AddressDTO model) {
		return addService.viewAdd(model);
	}

	@PostMapping("/delete")
	public String deleteAdd(@RequestBody AddressDTO model) {
		return addService.deleteAdd(model);
	}
}
