package com.office.inheri.re;

public class ChildRestaurant 
		extends ParentRestaurant 
		implements CheckList, CheckList2{
	//여기가 다향성
	
	public final static int PARENT_MENU = 1;
	public final static int CHILD_MENU = 2;
	
	
	
	public void makeBokkeumbap() {
		
		System.out.println("아들 볶음밥 만듦");
		}
	
	
	 
	public void makeJajang(int menu) {
		
		if (menu == PARENT_MENU) {
			super.makeJajang(); //super. 는 this.의 반대 즉 내 바로 위 를 호출함
		}else {
			System.out.println("아들꺼 mz세대 짜장면 만듦");
		}
		
	}
	
	//Override = 오버라이드(재정의)
	@Override
	public void makeTangsuyuk() {
		System.out.println("아들꺼 탕수육 만듦");
	}



	@Override
	public void checkFloor() {
		System.out.println("바닥 쓸기");
		
	}



	@Override
	public void checkToilet() {
		System.out.println("변기 청소");
		
	}



	@Override
	public void checkHwagu() {
		// TODO Auto-generated method stub
		System.out.println("화구 청소");
	}
	
	
	
}
