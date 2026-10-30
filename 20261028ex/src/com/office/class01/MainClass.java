package com.office.class01;

import java.util.HashMap;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
		//boolean systemFlag = true;
		Flag flag = new Flag();
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		if (config.IS_DEV) {
		MemberDumy memberDumy = new MemberDumy(memberDB);  //개발 환경이냐 아니냐 에 따라 실행을 되고 안돼는걸 정해야함
		memberDumy.initMemberDumyData();
		}
		/*
		 * 과제1: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
		
		while (flag.systemFlag) {
			
			System.out.println("1.SIGN-UP     2.SIGN-IN     3.MODIFY      4.DELETE  	5.PRINT_ALL_MEMBER     99.SYSTEM-OUT ");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case Menu.MENU_SIGN_UP:             //SIGN-UP
				
				//memberService =	new MemberService();
				memberService.doSignUp(scanner);
			
				break;
				
			case Menu.MENU_SIGN_IN:		        //SIGN-IN 
				//memberService = new MemberService();
				memberService.doSignIn(scanner, flag);
				
				
				break;
				
			case Menu.MENU_MODIFY:	            //MODIFY
				
				memberService.doModify(scanner);
				
				break;
				
			case Menu.MENU_DELETE:				//DELETE 
				
				memberService.doDelete(scanner);
				
				break;
			
			case Menu.MENU_PRINT_ALL_MEMBER:
				
				HashMap<String, Member> db = memberDB.memberDB; 
			
				for (String key :db.keySet()) {
				Member member =	db.get(key);
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
				for(Member member : db.values()) {
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
				break;
				
			case Menu.SYSTEM_OUT:			//SYSTEM-OUT
				
				flag.systemFlag = false; 
				System.out.println("Say Good bye~~~!");
				break;
				
				/*
				 * 과제: case에 사용되는 리터럴 상수 -> 상수 변경 *완료*
				 * 과제: 메뉴 5번 -> 전체회원 정보 출력하는 기능 
				 */
				 
				
			}
			

		}
		
		scanner.close();
		
		
	}
	
}