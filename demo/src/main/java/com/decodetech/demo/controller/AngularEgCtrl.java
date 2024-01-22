package com.decodetech.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decodetech.demo.repository.StudentRepo;
import com.decodetech.demo.repository.TeacherRepo;
import com.decodetech.demo.service.StudentService;
import com.decodetech.demo.service.WorkbookGenerator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/angEg")
@Controller
public class AngularEgCtrl {

	@GetMapping("/page")
    public String Page() {
        return "angPage";
    }
	
	@GetMapping("/empPage")
    public String empPage() {
        return "Emp";
    }
	
	@GetMapping("/deptPage")
    public String deptPage() {
        return "Dept";
    }
	
	@GetMapping("/mgrPage")
    public String mgrPage() {
        return "Mgr";
    }
	
}
