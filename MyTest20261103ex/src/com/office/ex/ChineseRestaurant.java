package com.office.ex;

public class ChineseRestaurant extends ParentRestaurant{
	
	/*
	public void open() {
		System.out.println("영업 시작!");
	}
	
	public void close() {
		System.out.println("영업 끝!");
	}
	*/
	
	private void makeJajang() {
		System.out.println("짜장 만들기!");
	}
	
	public void startCooking() {
		makeJajang();
	}
	
}
