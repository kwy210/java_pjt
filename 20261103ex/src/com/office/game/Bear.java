package com.office.game;

public class Bear implements ICharactor {

	private void walk(int x, int y) {
		System.out.printf("곰(은) %d, %d 네발로 로 이동한다.\n",x,y);
	}

	@Override
	public void run(int x, int y) {
		walk(x,y);
		
	}
	
}
