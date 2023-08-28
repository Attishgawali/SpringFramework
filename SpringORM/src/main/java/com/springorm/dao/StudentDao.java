package com.springorm.dao;

import java.util.List;

import com.springorm.entity.Student;

public interface StudentDao {
	
	public int inset(Student student);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudent();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Student student);
}
