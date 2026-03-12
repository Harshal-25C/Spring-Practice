package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		// ================== XML-based Spring Configuration ==================
//		String config_loc = "/in/sp/resources/ApplicationContext.xml";
// 		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
// 		
// 		Student stu = (Student) context.getBean("student");
// 		System.out.println(stu.display());
		
		
		// ================== Java-Based Spring Configuration ===================
		ApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
		
		Student stu = (Student) context.getBean("student");
		System.out.println(stu.display());
	}
}
