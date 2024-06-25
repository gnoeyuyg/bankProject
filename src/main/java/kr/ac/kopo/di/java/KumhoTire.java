package kr.ac.kopo.di.java;

import org.springframework.stereotype.Component;

@Component("kumho")
public class KumhoTire implements Tire {

	public KumhoTire() {
		System.out.println("금호타이어 생성...");
	}
	
	public String getBrand() {
		return "금호타이어";
	}


}
