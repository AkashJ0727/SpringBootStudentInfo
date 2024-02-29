package com.student.info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int StId;
	String StudentName;
	String StudentClass;
	String StudentAge;
	String StudentEmail;
	
	public Student() {
		
	}
	
	
	public Student(int stId, String studentName, String studentClass, String studentAge, String studentEmail) {
		super();
		StId = stId;
		StudentName = studentName;
		StudentClass = studentClass;
		StudentAge = studentAge;
		StudentEmail = studentEmail;
	}




	public int getStId() {
		return StId;
	}




	public void setStId(int stId) {
		StId = stId;
	}




	public String getStudentName() {
		return StudentName;
	}




	public void setStudentName(String studentName) {
		StudentName = studentName;
	}




	public String getStudentClass() {
		return StudentClass;
	}




	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}




	public String getStudentAge() {
		return StudentAge;
	}




	public void setStudentAge(String studentAge) {
		StudentAge = studentAge;
	}




	public String getStudentEmail() {
		return StudentEmail;
	}




	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}




	@Override
	public String toString() {
		return "Student [StId=" + StId + ", StudentName=" + StudentName + ", StudentClass=" + StudentClass
				+ ", StudentAge=" + StudentAge + ", StudentEmail=" + StudentEmail + "]";
	}
	
	

}
