package com.office.ex;

public class KoreanRestaurant extends ParentRestaurant{
	
	
	
	/*
	public void open() {
		System.out.println("영업 시작!");
	}
	
	public void close() {
		System.out.println("영업 끝!");
	}*/
	
	@Override
	public void open() {
		System.out.println("자식 영업 시작");
	}
	
	@Override
	public void close() {
		System.out.println("자식 영업 종료");
	}
	
	private void makeBibimbap() {
		System.out.println("비빔밥 만들기!");
	}
	
	public void startCooking() {
		makeBibimbap();
	}
	
}
