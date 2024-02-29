package com.student.info.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.info.dao.StudentRepository;
import com.student.info.model.Student;
@Service
public class ServiceImpl implements StudentService{
	@Autowired
    private	StudentRepository studentRepository;

	@Override
	public void saveStudent(Student std) {
	studentRepository.save(std);
		
	}

	@Override
	public List<Student> getAllClients() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudent(int StId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(StId);
	}

	@Override
	public void deleteStudent(int StId) {
		studentRepository.deleteById(StId);
		
	}

	@Override
	public Student selectStudentByAge(String age) {
		Student std=studentRepository.selectByAge(age);
		return std;
	}

	@Override
	public void updateStudent(Student std, int StId) {
	Optional<Student> optional= studentRepository.findById(StId);
	 Student student= optional.get();

	 student.setStudentName(std.getStudentName());
	 student.setStudentAge(std.getStudentAge());
	 studentRepository.save(student);
	}

	

	



}
