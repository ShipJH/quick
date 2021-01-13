package com.sp.quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class QuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickApplication.class, args);
	}

}
