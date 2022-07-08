package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.entity.Student;
import com.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Raja", "Rana", "raja123@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Nilesh", "Shahni", "nil99@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("DK", "Gupta", "dkgupt@gmail.com");
		 * studentRepository.save(student3);
		 */
	}
	

}
