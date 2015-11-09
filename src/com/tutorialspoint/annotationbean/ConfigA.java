package com.tutorialspoint.annotationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

	@Bean (name="a")
	public A a() {
		return new A();
	}
}
