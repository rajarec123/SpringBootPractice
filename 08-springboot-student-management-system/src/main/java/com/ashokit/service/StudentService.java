package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student upadteStudent(Student student);
	
	void deleteStudentById(Long id);
}
