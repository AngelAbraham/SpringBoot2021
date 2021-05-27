package com.example.demo.Student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	@GetMapping
	public List<Student> getStudent() {
		
		return List.of(new Student(
				21L, 
				"adasd",
				"asdad", 
				null, 
				23));
	}

}
