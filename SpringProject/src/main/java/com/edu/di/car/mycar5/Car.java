package com.edu.di.car.mycar5;

//-----------------------------------------------------------------------------------------------------------
//스프링을 통한 의존성 주입 - 스프링 설정 파일(XML)에서 속성 주입
//-----------------------------------------------------------------------------------------------------------
public class Car {
	
	Tire tire;

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어는 " + tire.getBrand();
	}

} // End - public class Car
