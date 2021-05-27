package com.example.demo.Student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServices {
public List<Student> getStudent() {
		
		return List.of(new Student(
				21L, 
				"adasd",
				"asdad", 
				null, 
				23));
	}

}
