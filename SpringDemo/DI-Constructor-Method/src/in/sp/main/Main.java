package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		// DI-Constructor method using XML-based configuration (ApplicationContext.xml)
		String config_loc = "/in/sp/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student stu = (Student) context.getBean("stuId");
		stu.display();
		
		System.out.println("------------------------------------");
		
		// DI-Constructor method using Java-based configuration (SpringConfigFile.java)
		ApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student stu2 = (Student) context2.getBean(Student.class);
		stu2.display();
	}
}