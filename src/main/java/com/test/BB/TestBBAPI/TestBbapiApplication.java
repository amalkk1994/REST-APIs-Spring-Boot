package com.test.BB.TestBBAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class TestBbapiApplication {
// this is a sample implementation using H2 in memory database
	@Bean
	public MessageSource messageSource() {

		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:validations.properties");
		return messageSource;
	}
	public static void main(String[] args) {
		SpringApplication.run(TestBbapiApplication.class, args);
	}

}
