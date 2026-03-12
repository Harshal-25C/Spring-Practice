package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Harshal")
	private String name;
	
	@Value("101")
	private int rollNo;
	
	@Value("httpsharsh@gmail.com")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String display() {
		return "Name = " + name + 
			   "\nRollNo = " + rollNo + 
			   "\nEmail = "+email;
	}
	
	
}