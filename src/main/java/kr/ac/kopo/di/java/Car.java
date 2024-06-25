package kr.ac.kopo.di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Qualifier("kumhoTire")
	@Autowired
	private Tire tire; // 의존관계 발생

	public Car() {
		System.out.println("Car() 자동차 객체 생성");
	}

	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 생성자주입");
	}

	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire() 속성주입");
	}

	public void printTireBrand() {
		System.out.println(tire.getBrand() + "장착...");
	}
}
