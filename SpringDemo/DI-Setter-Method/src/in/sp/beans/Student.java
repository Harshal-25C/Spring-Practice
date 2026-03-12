package in.sp.beans;

public class Student {
	private String name;
	private int rollNo;
	private Address address;
	
	public void setName(String name) {
		System.out.println("Setter method name called");
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		System.out.println("Setter method rollNo called");
		this.rollNo = rollNo;
	}
	public void setAddress(Address address) {
		System.out.println("Setter method address called");
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Address: "+address);
	}
}
