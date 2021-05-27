package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;

@SpringBootApplication
@RestController
public class AmigosCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosCodeApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		
		return List.of(new Student(
				21L, 
				"adasd",
				"asdad", 
				null, 
				23));
	}
}
