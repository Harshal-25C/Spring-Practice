package com.NamedParameterJDBCTemplate.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dm = new DriverManagerDataSource();
		
		dm.setDriverClassName("com.mysql.cj.jdbc.driver");
		dm.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db");
		dm.setUsername("root");
		dm.setPassword("#HaRsH*25&ch");
		
		return dm;
	}
	
	@Bean
	public NamedParameterJdbcTemplate myNdpTemp() {
		
//		NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(myDataSource());
//		return npjt;
		
		// or
		
		return new NamedParameterJdbcTemplate(myDataSource());
	}
}
