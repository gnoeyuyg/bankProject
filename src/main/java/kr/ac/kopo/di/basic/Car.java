package kr.ac.kopo.di.basic;

public class Car {

	private Tire tire;	// 의존관계 발생
	
	/*
	public Car() {
		// 의존관계 설정
		this.tire = new HankookTire();
		this.tire = new KumhoTire();
	}
	*/
	
	public Car() {}
	
	// 생성자방식의 의존주입
	public Car(Tire tire) {
		this.tire = tire;
	}

	// 속성방식의 의존조입
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
}
