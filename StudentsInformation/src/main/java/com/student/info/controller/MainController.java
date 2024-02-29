package com.student.info.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.info.globalresource.LoggerResource;
import com.student.info.model.Student;
import com.student.info.service.ServiceImpl;

@RestController
public class MainController {
	// logging is here
//	Logger logger=LoggerFactory.getLogger(MainController.class);\
	private  Logger logger = LoggerResource.getLogger(MainController.class);
	
	@Autowired
	private ServiceImpl serviceImpl;

	//SAVE DATA TO TABLE
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student std) {
		
		String methodName="saveStudent()";
		logger.info(methodName+"is called");

		serviceImpl.saveStudent(std);
		return "student information save successfully";
	}

	//DELETE DATA FROM THE TABLE
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable("id") int StId) {
		serviceImpl.deleteStudent(StId);
		return "record deleted successfully";
	}

	//SELECT DATA FROM TABLE
	@GetMapping("/getByAge/{age1}")
	public Student getByAge(@PathVariable("age1") String age) {
		Student std = serviceImpl.selectStudentByAge(age);
		return std;
	}

	//UPDATE DATA 
	@PutMapping("/update/{id1}")
	public String updateStudent(@PathVariable("id1") int StId,@RequestBody Student std) {
		serviceImpl.updateStudent(std, StId);
		return "record is updated successfully";
	}
}
