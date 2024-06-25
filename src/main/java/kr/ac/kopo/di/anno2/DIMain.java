package kr.ac.kopo.di.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		
		ApplicationContext context 
			= new GenericXmlApplicationContext("classpath:di/anno/di-anno3.xml");
		
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
				
	}
}