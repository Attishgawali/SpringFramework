package com.springorm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entity.Student;


public class StudentDaoImpl implements StudentDao{
	
	private HibernateTemplate hibernateTemplate;
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	//Save object
	@Transactional
	public int inset(Student student) {
		//insert
		Integer i=(Integer) hibernateTemplate.save(student);
		return i;
	}


	//get single object
	public Student getStudent(int studentId) {
		Student student = hibernateTemplate.get(Student.class, studentId);
		return student;
	}


	//get all object
	public List<Student> getAllStudent() {
		List<Student> students = hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	
	//Update object 
	@Transactional
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}


	//Delete Object
	@Transactional
	public void deleteStudent(Student student) {
		hibernateTemplate.delete(student);
	}
		
	

}
