package kr.ac.kopo.di.java;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		
		ApplicationContext context 
			= new AnnotationConfigApplicationContext(Config.class);
		
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();

				
	}
}
