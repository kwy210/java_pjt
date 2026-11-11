package com.office.exception;

public class StringbuilderEx {

	public static void main(String[] args) {
		
		String str = "";
		
		long beforecurrentTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			str += "s";
		}
		
		long aftercurrentTime = System.currentTimeMillis();
		
		
		System.out.println("1경과 시간 : " + (aftercurrentTime - beforecurrentTime));
		
		System.out.println("---------------------------------------------------");
		
		StringBuilder stringBuilder = new StringBuilder();
		
		beforecurrentTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("s");
		}
		
		aftercurrentTime = System.currentTimeMillis();
		
		System.out.println("2경과 시간 : " + (aftercurrentTime - beforecurrentTime));
		
		
		
		
		
		
		
	}
	
	
}
