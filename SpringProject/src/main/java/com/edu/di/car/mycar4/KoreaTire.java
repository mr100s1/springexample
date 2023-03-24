package com.edu.di.car.mycar4;

//-----------------------------------------------------------------------------------------------------------
//	스프링을 통한 의존성 주입 - XML 파일을 사용한다.
//	인터페이스를 사용하는 클래스는 인터페이스에 있는 모든 추상메서드를 구현해야 한다.
//-----------------------------------------------------------------------------------------------------------
public class KoreaTire implements Tire {

	@Override
	public String getBrand() {

		return "한국에서 만든 타이어";
	}

}