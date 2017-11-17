package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.setMessage("I'm object Khoa");
		obj.getMessage();
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	    objB.getMessage();
	    HelloWorld objC = (HelloWorld) context.getBean("helloWorldPrototype");
		obj.setMessage("I'm object Khoa");
		obj.getMessage();
		HelloWorld objD = (HelloWorld) context.getBean("helloWorldPrototype");
		objD.getMessage();
	}

}
