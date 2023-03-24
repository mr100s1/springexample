package com.edu.di.car.mycar2;

//-----------------------------------------------------------------------------------------------------------
//인터페이스를 사용하는 클래스는 인터페이스에 있는 모든 추상메서드를 구현해야 한다.
//-----------------------------------------------------------------------------------------------------------
public class AmericaTire implements Tire {

	//-----------------------------------------------------------------------------------------------------------
	@Override
	public String getBrand() {

		return "미국에서 만든 타이어";
	}

}
