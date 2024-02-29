package com.student.info.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.info.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	@Query(value = "select * from student where age=?1",nativeQuery = true)
	public Student selectByAge(String age);
}
