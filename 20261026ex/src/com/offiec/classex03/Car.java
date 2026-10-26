
package com.offiec.classex03;

public class Car {

	// 속성
	String carColor;
	String carNumber;
	
	// 생성자
	public Car(String carColor, String carNumber) {
		this.carColor = carColor;
		this.carNumber = carNumber;
	}
	
	
	// 기능
	public void printInfo() {
		System.out.println("carColor:"+ carColor);
		System.out.println("carNumber:"+ carNumber);
	}
	
	
	
}
