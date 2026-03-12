package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int rollNo;
	
	@Autowired      //Using @Autowired we don't need to call setter method in Bean of SpringConfigFile.java
	@Qualifier("createAddrObj2")   // When two or more @Bean (Objects) are present then we use @Qualifier to call specific object.
	private Address address;
	
	@Autowired
	private Subjects subjects;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	// We don't need setter method of Class Objects, whenever we use @Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
//	public void setSubjects(Subjects subjects) {
//		this.subjects = subjects;
//	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Address: "+address);
		System.out.println("Subjects: "+subjects);
	}
}

