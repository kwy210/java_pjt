package com.office.game;



public class Game {

	private Bear bear;
	private Robot robot;
	private AirPain airPain;
	private Dog dog;
	private ICharactor[] iCharactors;	
	
	public Game(Bear bear,Robot robot,AirPain airPain,Dog dog) {
		this.bear = bear;
		this.robot = robot;
		this.airPain = airPain;
		this.dog = dog;
		
	iCharactors = new ICharactor[] {
			this.bear,
			this.robot,
			this.airPain,
			this.dog
	};
		
		
	}
	
	
	
	public void move(int x, int y) {
//		bear.walk(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPain.fly(x, y);
		
		
		bear.run(x, y);
		robot.run(x, y);
		dog.run(x, y);
		airPain.fly(x, y);
		
		for (int i = 0; i < iCharactors.length; i++) {
			iCharactors[i].run(x, y);
			
		}
		
	}
	
}
