package com.office.exception;

public class MainClass {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 10
		
		/*
		 * 예외 처리 try ~ catch문
		 */
		try{
			System.out.println("num1 / num2 = " + (num1 / num2)); // Exception 발생 이 아래로는 실행 X
			
			//Exception 은 최상위 클레스
		} catch (NullPointerException e) {
		//	System.out.println(e.getMessage());	// 대충 보여줌
			e.printStackTrace(); // 디테일 하게 보여줌
			
		} catch (ArithmeticException e) {
			System.out.println("Fire ArithmeticException");
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("finally 실행");
		}
		
		System.out.println("num1 - num2 = " + (num1 - num2)); // 10
		System.out.println("num1 x num2 = " + (num1 * num2)); // 0
		
		
	}
	
}
