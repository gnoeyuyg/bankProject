package kr.ac.kopo.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		
		ApplicationContext context 
			= new GenericXmlApplicationContext("classpath:di/xml/di-xml.xml");
		
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
		
		Car car2 = context.getBean("car2", Car.class);
		car2.printTireBrand();

		
		
		
		/*
		Tire tire = new HankookTire();
		Tire tire2 = new KumhoTire();
		
		Car car = new Car(tire);
		
		Car car2 = new Car();
		car2.setTire(tire2);
		*/
		
	}
}
