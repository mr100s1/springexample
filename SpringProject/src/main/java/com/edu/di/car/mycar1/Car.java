package com.edu.di.car.mycar1;

//-----------------------------------------------------------------------------------------------------------
public class Car {
	
	Tire tire;
	
	//-----------------------------------------------------------------------------------------------------------
	//	자동차가 타이어를 생산(new)하는 부분이 의존관계가 일어나고 있는 부분이다.
	//	tire	= new KoreaTire(); <= 타이어 생산
	//-----------------------------------------------------------------------------------------------------------
	public Car() {
		tire	= new KoreaTire();
	}
	
	public String getTireBrand() {
		return "현재 장착된 타이어는 " + tire.getBrand();
	}

} // End - public class Car

