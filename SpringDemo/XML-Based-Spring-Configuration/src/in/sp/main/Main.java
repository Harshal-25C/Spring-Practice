package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc = "/in/sp/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student st = (Student) context.getBean("stdId");
		System.out.print(st.display());
		
		System.out.println("\n-----------------------");
		
		Student st2 = (Student) context.getBean("stdId2");
		System.out.print(st2.display());
	}
}