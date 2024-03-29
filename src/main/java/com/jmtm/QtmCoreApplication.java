package com.jmtm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class QtmCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(QtmCoreApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

}
