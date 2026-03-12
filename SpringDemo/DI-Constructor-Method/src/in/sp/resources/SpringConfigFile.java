package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address adr = new Address(385, "Burhanpur", 450331);
		
		return adr;
	}
	
	@Bean
	public Student createStuObj() {
		Student stu = new Student("Harshal", 102, createAddrObj());
		
		return stu;
	}
}