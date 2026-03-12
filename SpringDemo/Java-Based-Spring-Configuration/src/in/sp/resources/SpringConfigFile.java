package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student std() {
		Student stu = new Student();
		
		stu.setName("Harshal");
		stu.setRollNo(101);
		stu.setEmail("httpsharsh@gmail.com");
		
		return stu;
	}
	
	// or
	
	@Bean("stdObj1")
	public Student createObj1() {
		Student stu = new Student();
		
		stu.setName("Anvii");
		stu.setRollNo(102);
		stu.setEmail("anviihkc45@gmail.com");
		
		return stu;
	}
	
	@Bean("stdObj2")
	public Student createObj2() {
		Student stu = new Student();
		
		stu.setName("Chaitali");
		stu.setRollNo(103);
		stu.setEmail("chaitali45@gmail.com");
		
		return stu;
	}
}
