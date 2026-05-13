package com.example.day2;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Day2Application.class, args);
		System.out.println(context.getBeanDefinitionCount());

		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			BeanDefinition bd = context.getBeanFactory().getBeanDefinition(bean);
			if (bd.isLazyInit()) {
				System.out.println("Bean Name: " + bean + " | Class: " + bd.getBeanClassName());
			}
		}
	}

}
