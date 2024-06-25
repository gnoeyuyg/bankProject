package kr.ac.kopo.di.anno2;

import org.springframework.stereotype.Component;

@Component
public class HankookTire implements Tire {
	
	public HankookTire() {
		System.out.println("한국타이어 생성....");
	}

	public String getBrand() {
		return "한국타이어";
	}
	
	

	
}
