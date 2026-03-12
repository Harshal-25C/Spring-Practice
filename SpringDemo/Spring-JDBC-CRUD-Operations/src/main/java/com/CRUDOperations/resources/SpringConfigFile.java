package com.CRUDOperations.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		dataSource.setUsername("root");
		dataSource.setPassword("#HaRsH*25&ch");
		;
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemp() {
		
		JdbcTemplate jdbcTemp = new JdbcTemplate();
		
		jdbcTemp.setDataSource(myDataSource());
		
		return jdbcTemp;
	}
}
