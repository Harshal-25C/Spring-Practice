package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() {
		Address adr = new Address();
		
		adr.setHouseNo(385);
		adr.setCity("Burhanpur");
		adr.setPincode(450331);
		
		return adr;
	}
	
	@Bean
	public Address createAddrObj2() {
		Address adr = new Address();
		
		adr.setHouseNo(386);
		adr.setCity("Jalgoan");
		adr.setPincode(460231);
		
		return adr;
	}
	
	@Bean
	public Subjects createSubjObj() {
		
		Subjects sb = new Subjects();
		
		List<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("Pyhton");
		subjects.add("Spring Boot");
		
		sb.setSubjects(subjects);
		
		return sb;
	}
	
	@Bean
	public Student createStuObj() {
		Student stu = new Student();
		
		stu.setName("Harshal");
		stu.setRollNo(101);
//		stu.setAddress(createAddrObj1()); // Manually DI, Instead we can use @Autowired
//		stu.setSubjects(createSubjObj()); // Manually DI, Instead we can use @Autowired annotation 
		                                  // in instance object of Subjects class in student class
		
		return stu;
	}
}