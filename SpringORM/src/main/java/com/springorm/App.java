package com.springorm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Porgram Started!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        boolean go = true;
        
        while(go) {
        	System.out.println("Press 1 for add new student");
        	System.out.println("Press 2 for get detail of single student");
        	System.out.println("Press 3 for get all students");
        	System.out.println("Press 4 for update student");
        	System.out.println("Press 5 for delete student");
        	System.out.println("Press 6 for exit");
        	
        	try {
        		
        		Scanner sc = new Scanner(System.in);
            	int userInput = sc.nextInt();
            	
            	switch(userInput) {
            		
            	case 1:
            		System.out.println("Enter new Student id :");
            		int id = sc.nextInt();
            		
            		System.out.println("Enter new Student name :");
            		String name = sc.next();
            		
            		System.out.println("Enter new Student city :");
            		String city = sc.next();
            		
            		Student student = new Student(id,name,city);
            		int i = studentDao.inset(student);
            		
            		if(i!=0) {
            			System.out.println(student + " inserted successfully \n");
            		}else {
            			System.out.println(id +" id already exist");
            		}
            		
            		break;
            		
            		
            		
            	case 2:
            		System.out.println("Enter Student id to get Student detail :");
            		int id2 = sc.nextInt();
            		Student student2 = studentDao.getStudent(id2);
            		if(student2!=null) {
            			System.out.println("Student details are "+student2 +"\n");
            		}else {
            			System.out.println(id2+ " id student not exist");
            		}
            		break;
            		
            		
            		
            		
            	case 3:
            		List<Student> allStudent = studentDao.getAllStudent();
            		System.out.println("All Student Deatils are : ");
            		for(Student s: allStudent) {
            			System.out.println(s);
            		}
            		System.out.println("\n");
            		break;
            		
            		
            		
            		
            	case 4:
            		System.out.println("Enter Student id you want to update: ");
            		int id3 = sc.nextInt();
            		
            		System.out.println("Enter Student new name : ");
            		String name3 = sc.next();
            		
            		System.out.println("Enter Student new city : ");
            		String city3 = sc.next();
            		
            		Student student3 = new Student(id3,name3,city3);
            		studentDao.updateStudent(student3);
            		System.out.println("Student updated succesfully ...\n");
            		break;
            		
            		
            		
            	
            	case 5:
            		System.out.println("Eneter student Id you want to delete : ");
            		int id4 = sc.nextInt();
            		
            		Student student4 = studentDao.getStudent(id4);
            		studentDao.deleteStudent(student4);
            		System.out.println("Student delete Successfully ... \n");
            		break;
            		
            		
            		
            	
            	case 6:
            		go=false;
            		System.out.println("Thank You !! \n");
            		break;
            	}
        		
        	}catch (Exception e){
        		System.out.println("Invalid Input");
        		System.out.println(e.getMessage());
        	}
        	
        	
        	
        }
    }
}
