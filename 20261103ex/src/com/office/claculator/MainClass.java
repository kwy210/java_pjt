package com.office.claculator;

public class MainClass {

	public static void main(String[] args) {
		
		OurCalculator ourCalculator =
				new OurCalculator();
		
		// 20 + 10 = 
		/*
		ourCalculator.calAdd(20, 10);
		ourCalculator.calSub(20, 10);
		ourCalculator.calMul(20, 10);
		ourCalculator.calDiv(20, 10);
		*/
			//Strategy 패턴	 //외부에서 만들어서 주입한다 = 디펜던시 인젝션
		ourCalculator.claculate(20, 10, new CalAdd());
		ourCalculator.claculate(20, 10, new CalSub());
		ourCalculator.claculate(20, 10, new CalMul());
		ourCalculator.claculate(20, 10, new CalDiv());
		
		
	}
	
}
