package in.sp.main;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		// ("std")
		Student stu = (Student) ac.getBean("std");
		System.out.println(stu.display());
		
		// Or   (Student.class)
		
//		Student stu2 = (Student) ac.getBean(Student.class);
//		System.out.println(stu2.display());
		
		// Or  @Bean("stObj1")
		
		Student stu3 = (Student) ac.getBean("stdObj1");
		System.out.println(stu3.display());
		
		System.out.println("\n--------------------------");
		
		Student stu4 = (Student) ac.getBean("stdObj2");
		System.out.println(stu4.display());
	}
}
