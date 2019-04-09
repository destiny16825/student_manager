package com.qf.stu_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.qf")
public class StuWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuWebApplication.class, args);
	}

}
