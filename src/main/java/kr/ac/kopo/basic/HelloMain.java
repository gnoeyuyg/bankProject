package kr.ac.kopo.basic;

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) throws Exception {
		
	//	Hello hello = new Hello();
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
		
		Hello hello = (Hello)context.getBean("hello");
		hello.greeting();
		
		
	}
}









