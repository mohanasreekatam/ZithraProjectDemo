package com.zithara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ZitharaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZitharaProjectApplication.class, args);
	}

}
