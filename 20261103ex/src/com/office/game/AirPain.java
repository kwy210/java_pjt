package com.office.game;

public class AirPain implements ICharactor {

	public void fly(int x, int y) {
		System.out.printf("비행기(은) %d, %d 로 날아서 이동한다.\n" ,x,y);
	}

	@Override
	public void run(int x, int y) {
		fly(x,y);
		
	}
	
}
