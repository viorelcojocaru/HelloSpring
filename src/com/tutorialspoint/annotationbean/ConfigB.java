package com.tutorialspoint.annotationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigA.class})
public class ConfigB  {
	@Bean (name="b")
	public B a(){
		return  new B();
	}
	
}
