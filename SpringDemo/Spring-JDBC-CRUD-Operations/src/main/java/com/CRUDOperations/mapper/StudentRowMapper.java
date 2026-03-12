package com.CRUDOperations.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.CRUDOperations.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student stu = new Student();
		
		stu.setRollno(rs.getInt("std_roll"));
		stu.setName(rs.getString("std_name"));
		stu.setMarks(rs.getFloat("std_marks"));
		
		return stu;
	}

}
