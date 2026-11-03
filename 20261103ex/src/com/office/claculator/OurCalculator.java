package com.office.claculator;

public class OurCalculator {
	// ICalculator iCalculator = new CalAdd();
	public void claculate(int n1, int n2, ICalculator iCalculator) {
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: "+ result);
	}
	
/*
	// 덧셈
	public void calAdd(int n1, int n2) {
//		int result = n1 + n2;
		ICalculator iCalculator = new CalAdd();
		iCalculator.doOperator(n1, n2);
		int result = iCalculator.doOperator(n1, n2);
//		int result = calAdd.calAdd(n1, n2);
		System.out.println("result: "+ result);
	}
	
	// 뻴셈
	public void calSub(int n1, int n2) {
		ICalculator iCalculator = new CalSub();
		iCalculator.doOperator(n1, n2);
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: "+ result);
	}
	
	// 곱셈
	public void calMul(int n1, int n2) {
		ICalculator iCalculator = new CalMul();
		iCalculator.doOperator(n1, n2);
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: "+ result);
	}
	
	// 나눗셈
	public void calDiv(int n1, int n2) {
		ICalculator icCalculator = new CalDiv();
		icCalculator.doOperator(n1, n2);
		int result = icCalculator.doOperator(n1, n2);
		System.out.println("result: "+ result);
	}
	
	*/
	
	
	
}
