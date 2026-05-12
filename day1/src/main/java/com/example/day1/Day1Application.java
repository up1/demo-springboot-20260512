package com.example.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx
				= SpringApplication.run(Day1Application.class, args);
		String[] beans = ctx.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean);
		}
		System.out.println(ctx.getBeanDefinitionCount());
	}

}
