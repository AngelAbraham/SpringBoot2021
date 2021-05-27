package com.example.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentServices stundentService;
	
	@Autowired
	public StudentController(StudentServices stundentService) {
		this.stundentService = stundentService;
	}
	
	@GetMapping
	public List<Student> getStudent() {
		return stundentService.getStudent();
	}

}
