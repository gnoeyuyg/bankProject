package kr.ac.kopo.di.xml;

public class Car {

	private Tire tire;	// 의존관계 발생
	
	/*
	public Car() {
		// 의존관계 설정
		this.tire = new HankookTire();
		this.tire = new KumhoTire();
	}
	*/
	
	public Car() {
		System.out.println("Car() 자동차 객체 생성");
	}
	
	// 생성자방식의 의존주입
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 자동차 객체 생성");
	}

	// 속성방식의 의존조입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire() 속성주입");
	}
	
	public void printTireBrand() {
		System.out.println(tire.getBrand() + "장착...");
	}
}
