package com.sample.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.bean.Student;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-config.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student);
                context.close();
    }
}
