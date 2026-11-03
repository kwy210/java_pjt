package com.office.inheri;

import java.awt.Choice;

import com.office.inheri.re.ChildRestaurant;
import com.office.inheri.re.ParentRestaurant;

public class MainClass {
	
	public static void main(String[] args) {
		
//		ParentRestaurant parentRestaurant =
//				new ParentRestaurant();
//		
//		parentRestaurant.makeJajang();
//		parentRestaurant.makeJjamppong();
		
		System.out.println("-------------------------------");
		
		ChildRestaurant childRestaurant =
				new ChildRestaurant();
		
		
		childRestaurant.makeJajang(2);  // true: 아들꺼  false : 아빠꺼
		childRestaurant.makeJjamppong();
		childRestaurant.makeBokkeumbap();
		childRestaurant.makeTangsuyuk();
		childRestaurant.checkFloor();
		childRestaurant.checkToilet();
		childRestaurant.checkHwagu();
		
		
	}
	
}
