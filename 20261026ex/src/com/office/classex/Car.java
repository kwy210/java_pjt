package com.office.classex;

public class Car {
	
	
	
	// 속성 
	String color = "Black";
	double size = 5.2;
	int displacement = 2000;
	
	//생성자 Constructor
		public Car() {
			System.out.println("CAR CONSTRUCTOR CALLED!!!");
		}
		
	// 기능 .... 선언부
	public void drive() {
		System.out.println("drive() called!!!");
	}
	
	public void parking() {
		System.out.println("parking() called!!!");
	}
	
	public void stop() {
		System.out.println("stop() called!!!");
	}
	
	public void callAllMethod() {
		drive();
		parking();
		stop();
	}
			
}
