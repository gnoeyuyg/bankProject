package kr.ac.kopo.di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// di-anno03.xml 대체문법
@ComponentScan(basePackages = {"kr.ac.kopo.di.java"})
// di-anno2.xml 대체 클래스
@Configuration
public class Config {

	/*
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean(name="hankook")
	public Tire hankookTire() {
		return new HankookTire();
	}
	
	@Qualifier("kumho")
	@Bean
	public Tire kumhoTire() {
		return new KumhoTire();
	}
	*/
}





