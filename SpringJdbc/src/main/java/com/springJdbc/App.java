package com.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started !" );
        
        //spring jdbc => 

        
//        ApplicationContext context =  new ClassPathXmlApplicationContext("com/springJdbc/config.xml");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class); 
        		
        		
        //insert 
//        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student = new Student();
//        student.setId(203);
//        student.setName("shubham");
//        student.setCity("Sangamner");
//    
//        int result = studentDao.insert(student);
//        System.out.println(result);
        
        
        //update 
//        StudentDao studentDao2 = context.getBean("studentDao",StudentDao.class);
//        Student student2 = new Student();
//        student2.setId(203);
//        student2.setName("shubham londhe");
//        student2.setCity("Sinnar");
//    
//        int result2 = studentDao2.change(student2);
//        System.out.println(result2 + " Rows updated successfully ...");
        
        
        //delete
//      StudentDao studentDao3 = context.getBean("studentDao",StudentDao.class);  
//      int result3 = studentDao3.delete(203);
//      System.out.println(result3 + " Rows deleted successfully ...");
        
        
        //Select single student
//        StudentDao studentDao4= context.getBean("studentDao",StudentDao.class);
//        Student student = studentDao4.getSudent(201);
//        System.out.println(student);
        
      //Select All student
        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student s: allStudents) {
        	System.out.println(s);
        }
        
    }
}
