package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		ChineseRestaurant chineseRestaurant = new ChineseRestaurant();
		
		chineseRestaurant.open();
		chineseRestaurant.close();
		//chineseRestaurant.makeJajang();
		chineseRestaurant.startCooking();
		
		System.out.println("------------------------------");
		
		KoreanRestaurant koreanRestaurant = new KoreanRestaurant();
		
		koreanRestaurant.open();
		koreanRestaurant.close();
		//koreanRestaurant.makeBibimbap();
		koreanRestaurant.startCooking();
		
	}
	
}
