package br.com.blz.testjava;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class TestJavaApplication {
	
	@Value("${spring.datasource.classname:}")
	static String className;
	
	@Value("${spring.datasource.url:}")
	static String url;
	
	@Value("${spring.datasource.username:}")
	static String userName;
	
	@Value("${spring.datasource.password:}")
	static String password;

	public static void main(String[] args) {
		SpringApplication.run(TestJavaApplication.class, args);
	}
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(className);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return (DataSource) dataSource;
	}
}
