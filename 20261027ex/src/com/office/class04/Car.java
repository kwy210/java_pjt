package com.office.class04;

import java.lang.reflect.Constructor;

public class Car {

	//멤버필드
	String color;
	int lenght;
	int price;
	int displacement;
	
	
	//생성자
	public Car() {
		System.out.println("---CONSTRUCTOR---");
	}


	public Car(
			String color,
			int lenght,
			int price,
			int displacement) {
		super();
		this.color = color;
		this.lenght = lenght;
		this.price = price;
		this.displacement = displacement;
	}
	
	
	
	//메서드
	// int speed : 파라미터 == 매개 변수
	public void goForward(int speed) {
		System.out.println("---goForward() method--- ");
		System.out.println(speed + "km/h");
	}
	
	public void goBack() {
		System.out.println("---goBack() method--- ");
		
	}
	
	public void doTest() {
		goForward(30);	//	==	this.goForward();
		goBack();		//	==	this.goBack();
	}
	
}
