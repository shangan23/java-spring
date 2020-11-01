package org.shangan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static ApplicationContext factory;

	public static void main(String[] args) {
		System.out.println("Drawing APP");
		factory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
