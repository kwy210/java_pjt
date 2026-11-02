package com.office.inheri.re;
		//추상
public abstract class ParentRestaurant {

	//메서드
	public void makeJajang() {
		System.out.println("아빠가 짜장 만듦");
	}
	
	public void makeJjamppong() {
		System.out.println("아빠가 짬뽕 만듦");
	}
	
	// 탕수육 만드는 기술 반드시 익혀!!
	public abstract void makeTangsuyuk();
		//이것이 추상 메소드 고 추상메소드 를 받을려면 추상클래스를 실채화 해야한다
	
	
}
