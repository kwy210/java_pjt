package com.office.claculator;

public class CalDiv implements ICalculator {

	// 나눗셈
	/*
		public int calDiv(int n1, int n2) {
			int result = n1 / n2;
			return result;
		}
*/
		@Override
		public int doOperator(int n1, int n2) {
			int result = n1 / n2;
			return result;
		}
	
}
