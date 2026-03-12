package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
		// DI-Setter Method using XML-based Configuration (ApplicationContext.xml)
		String config_loc = "/in/sp/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student stu = (Student) context.getBean("stuId");
		stu.display();
		
		System.out.println("------------------------------");
		
		// DI-Setter Method using Java-based Configuration (SpringConfigFile.java)
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student stu2 = (Student) ac.getBean(Student.class);
		stu2.display();
	}
}
