package com.joy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={SecurityAutoConfiguration.class})
@ServletComponentScan
@ComponentScan({"com.joy.modules.activiti.org.activiti", "com.joy"})
public class JoyBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JoyBootApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JoyBootApplication.class);
	}


}
