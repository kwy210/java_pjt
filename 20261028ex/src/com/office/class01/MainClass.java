package com.office.class01;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		MemberDumy memberDumy = new MemberDumy(memberDB);
		memberDumy.initMemberDumyData();
		
		/*
		 * 과제1: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
	
		
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int MENU_END= 99;
		
		while (systemFlag) {
			
			System.out.println("1.SIGN-UP     2.SIGN-IN     3.MODIFY      4.DELETE       99.SYSTEM-OUT ");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case MENU_SIGN_UP:             //SIGN-UP
				
				//memberService =	new MemberService();
				memberService.doSignUp(scanner);
			
				break;
				
			case MENU_SIGN_IN:		        //SIGN-IN 
				//memberService = new MemberService();
				memberService.doSignIn(scanner);
				
				
				break;
				
			case MENU_MODIFY:	            //MODIFY
				
				memberService.doModify(scanner);
				
				break;
				
			case MENU_DELETE:				//DELETE 
				
				memberService.doDelete(scanner);
				
				break;
				
				
			case MENU_END:			//SYSTEM-OUT
				
				systemFlag = false; 
				System.out.println("Say Good bye~~~!");
				break;
				
				/*
				 * 과제: case에 사용되는 리터럴 상수 -> 상수 변경
				 * 과제: 메뉴 5번 -> 전체회원 정보 출력하는 기능
				 */
				
			}
			

		}
		
		scanner.close();
		
		
	}
	
}