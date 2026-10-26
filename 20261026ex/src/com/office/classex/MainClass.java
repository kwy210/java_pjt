package com.office.classex;

public class MainClass {

	public static void main(String[] args) {
		
		//자동차(Car) = 속성(색상, 길이) + 기능(전진, 후진, 정지)
		
	  	// 자동차1 객체 생성
		Car car1 = new Car();
		
		//메인 메서트 꺼 그래서 Car 랑은 남남
		String color = "red";
		
		// . 도트접근연산자
		System.out.println(car1.color); //Black
		System.out.println(car1.size); //5.2
		System.out.println(car1.displacement); //2000
		
		//호출부
		car1.drive();//drive() called!!!
		car1.stop();//stop() called!!!
		car1.parking();//parking() called!!!
		
		car1.callAllMethod(); 
		
		// 클래스와 객체지향 에 특징 생성될떄마다 다른 존재다
		Car car2 = new Car();
		System.out.println("car2 color:"+ car2.color); // Black
		car2.color = "white";
		System.out.println("car2 color:"+ car2.color); // white
		
		Car car3 = new Car();
		System.out.println("car3 color:"+ car3.color); //Black
		
		//car3 에 car2 주소를 덮어씌움 car3는 가르키는 존재가 없어서 GC가 가져감
		car3 = car2;
		
		car3 = null;
		
	}

}
