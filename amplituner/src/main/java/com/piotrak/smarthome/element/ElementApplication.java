package com.piotrak.smarthome.element;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties"}, ignoreResourceNotFound = true)
@ComponentScan("com.piotrak.smarthome")
public class ElementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElementApplication.class, args);
	}

}
