package com.student.info.service;

import java.util.List;
import java.util.Optional;

import com.student.info.model.Student;

public interface StudentService {

	public void saveStudent(Student std);

	List<Student> getAllClients();

	Optional<Student> getStudent(int StId);
	
	public void deleteStudent(int StId);
	
	public Student selectStudentByAge(String age);
	
	public void updateStudent(Student std,int StId);
}
