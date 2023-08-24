package com.springJdbc.dao;

import java.util.List;

import com.springJdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getSudent(int studentId);
	public List<Student> getAllStudents();
}
