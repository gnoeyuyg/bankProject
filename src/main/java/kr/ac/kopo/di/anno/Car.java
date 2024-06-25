package kr.ac.kopo.di.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

//	@Qualifier("hankook")
//	@Autowired
	private Tire tire; // 의존관계 발생

	public Car() {
		System.out.println("Car() 자동차 객체 생성");
	}

	// 생성자방식의 의존주입
	@Autowired
	public Car(@Qualifier("hankook") Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 자동차 객체 생성");
	}

	// 속성방식의 의존주입
	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire() 속성주입");
	}

	public void printTireBrand() {
		System.out.println(tire.getBrand() + "장착...");
	}
}