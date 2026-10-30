package com.office.methodex;

import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator = 
				new Calculator();
		
		float rst = calculator.addOperator(10, 20);
		//System.out.println("rst:" +rst);
		
		//Calculator 를 이용해서 자동차 하나 가지고 싶어요.
		Object myCar = calculator.productCar();
		System.out.println("myCar: "+ myCar);
		
	}

	
}
