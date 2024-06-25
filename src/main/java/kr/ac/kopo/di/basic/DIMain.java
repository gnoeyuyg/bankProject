package kr.ac.kopo.di.basic;

public class DIMain {

	public static void main(String[] args) {
		
		Tire tire = new HankookTire();
		Tire tire2 = new KumhoTire();
		
		Car car = new Car(tire);
		
		Car car2 = new Car();
		car2.setTire(tire2);
		
	}
}
