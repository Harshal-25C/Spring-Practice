package in.sp.beans;

public class Student {
	private String name;
	private int rollNo;
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
