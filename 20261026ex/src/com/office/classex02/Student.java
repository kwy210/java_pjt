package com.office.classex02;

public class Student {

	//속성
	String name;
	int grade;
	int age;
	String major;
	
	//생성자
	public Student(String name, int grade, int age, String major) {
		System.out.println("---Constructor---");
		
		//this. = 전역변수 인 것을 가르키는 키워드 (this.는 필드와 매개변수의 이름이 같을 때 특히 중요합니다.)
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
		
	}

	//기능(매서드)
	public void printInfo() {
		System.out.println("Name:"+ name);
		System.out.println("Grade:"+ grade);
		System.out.println("Age:"+ age);
		System.out.println("Major:"+ major);
	}
	
	
}
