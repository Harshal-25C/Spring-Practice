package com.CRUDOperations.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.CRUDOperations.beans.Student;
import com.CRUDOperations.mapper.StudentRowMapper;
import com.CRUDOperations.resources.SpringConfigFile;

public class App {
    public static void main( String[] args ){
        
    	ApplicationContext context = new  AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate jdbcTemp = (JdbcTemplate) context.getBean(JdbcTemplate.class);
    	
    	
    	// ------------------Insert Operation------------------------
//    	int std_rollno = 12;
//    	String std_name = "Bhushan";
//    	float std_marks = 89.2f;
//    	
//    	String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//    	int count = jdbcTemp.update(insert_sql_query, std_rollno, std_name, std_marks);
//    	
//    	if(count > 0) {
//    		System.out.println("Insertion Successful!");
//    	}else {
//    		System.out.println("Not Inserted!");
//    	}
    	
    	
    	
    	// ------------------Update Operation-------------------------
//    	int std_rollno = 101;
//    	float std_marks = 95.2f;
//    	
//    	String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
//    	int count = jdbcTemp.update(update_sql_query, std_marks, std_rollno);
//    	
//    	if(count > 0) {
//    		System.out.println("Update Successfully!");
//    	}else {
//    		System.out.println("Updation failed");
//    	}
    	
    	
    	// ------------------Delete Operation-------------------------
//    	int std_rollno = 101;
//    	
//    	String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
//    	int count = jdbcTemp.update(delete_sql_query, std_rollno);
//    	
//    	if(count > 0) {
//    		System.out.println("Deleted Successfully!");
//    	}else {
//    		System.out.println("Deletion failed or Data Can't be exist");
//    	}
    	
    	
    	
    	// ------------------Select Operation 1-------------------------
    	String select_sql_query = "SELECT * FROM student";
    	List<Student> stu_list = jdbcTemp.query(select_sql_query, new StudentRowMapper());
    	
    	for(Student std : stu_list) {
    		System.out.println("Roll No: "+ std.getRollno());
    		System.out.println("Name: "+std.getName());
    		System.out.println("Marks: "+std.getMarks());
    		System.out.println("-------------------------");
    	}
    	
    	
    	// ------------------Select Operation 2-------------------------
//    	int rollno = 101;
//    	String select_sql_query2 = "SELECT * FROM student WHERE std_roll=?";
//    	List<Student> stu_list2 = jdbcTemp.query(select_sql_query2, new StudentRowMapper(), rollno);
//    	
//    	for(Student std : stu_list2) {
//    		System.out.println("Roll No: "+ std.getRollno());
//    		System.out.println("Name: "+std.getName());
//    		System.out.println("Marks: "+std.getMarks());
//    	}
    	
    	
    	// ------------------Select Operation for only one object using queryObject()-------------------------
    	int rollno = 102;
    	String select_sql_query3 = "SELECT * FROM student WHERE std_roll=?";
    	Student stu_list3 = jdbcTemp.queryForObject(select_sql_query3, new StudentRowMapper(), rollno);
    	
    	System.out.println("Roll No: "+ stu_list3.getRollno());
    	System.out.println("Name: "+stu_list3.getName());
    	System.out.println("Marks: "+stu_list3.getMarks());
    	
    }
}
