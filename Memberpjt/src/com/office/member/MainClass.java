package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 설명필요
		boolean systemFlag = true;
		String[] memberInfos;
		
		// 설명필요
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int MENU_END= 99;
		
		
		//     "gildong", ["1234", "gildong@gamil.com", "010-1234-5678"]
		//	   "chanho", ["0000", "chanho@naver.com", "010-2222-3333"]
		HashMap<String,  String[]> members = new HashMap<String, String[]>();
		
		//더미 데이터 시작
		members.put("gildong", new String[]{"gildong", "1234", "gildong@gamil.com", "010-1234-5678"});
		
		memberInfos = members.get("gildong");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		// 더미 끝
		
		//더미 데이터 시작
		members.put("chanho", new String[]{"chanho", "0000", "chanho@naver.com", "010-2222-3333"});
				
		memberInfos = members.get("chanho");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		// 더미 끝
		
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.END");
			
			int selectedMenuMember = scanner.nextInt();
			// 설명 필요
			String memberID;
			String memberPW;
			String memberMail;
			String memberPhone;
			
			switch (selectedMenuMember) {
			case MENU_SIGN_UP:               //SIGN-UP (회원가입)
				
				System.out.println("Input new member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input new member PW!!");
				memberPW = scanner.next();
				
				System.out.println("Input new member MAIL!!");
				memberMail = scanner.next();
				
				System.out.println("Input new member PHONE");
				memberPhone = scanner.next();
				
				members.put(memberID, new String[]{memberID, memberPW, memberMail, memberPhone});
				
				memberInfos = members.get(memberID);
				for (int i = 0; i < memberInfos.length; i++) {
					System.out.println(memberInfos[i]);
				}
				
				//foreach 
//				for (String memberInfo : memberInfo) {
//					System.out.println(memberInfo);
//				}
				
				break;			  

			case MENU_SIGN_IN:				  //SIGN-IN (로그인)
				
				System.out.println("Input new member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input new member PW!!");
				memberPW = scanner.next();
							
				memberInfos = members.get(memberID);
				System.out.println("memberInfos:"+ memberInfos); //searchedMember:[Ljava.lang.String;@7cf10a6f
				
				if (memberInfos != null && memberInfos[1].equals(memberPW)) {

				    if (memberInfos[1].equals(memberPW)) {
				        // ID, PW 일치 == 로그인 성공
				        System.out.println("SIGI-IN SUCCESS!!");

				    } else {
				        // PW 불일치 == 로그인 실패
				        System.out.println("SIGI-IN FAIL");
				    } // 안쪽 if-else 종료

					} else {
						// ID 불일치 == 로그인 실패
						System.out.println("SIGI-IN FAIL");
					} // 바깥쪽 if-else 종료
				
				
				break;
				
			case MENU_MODIFY:				  //MODIFY (정보수정)
				
				System.out.println("Input  member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input  member PW!!");
				memberPW = scanner.next();
				
				System.out.println("Input  member MAIL!!");
				memberMail = scanner.next();
				
				System.out.println("Input  member PHONE");
				memberPhone = scanner.next();
				
				memberInfos = members.get(memberID);
				if (memberInfos != null) {
					
					memberInfos[1] = memberPW;
					memberInfos[2] = memberMail;
					memberInfos[3] = memberPhone;
					
					String[] tempInfos = members.get(memberID);
					for (String tempInfo : tempInfos) {
						System.out.println(tempInfo);
					}
					
				}else {
					System.out.println("존재하지 않는 ID 입니다. 다시 확인하세요.");
					
				}
				
				
				break;
				
			case MENU_DELETE:				  //DELETE (탈퇴)
					
				System.out.println("Input  member ID!!");
				memberID = scanner.next();
				
				System.out.println("Input  member PW!!");
				memberPW = scanner.next();
				
				memberInfos = members.get(memberID);
				if(memberInfos != null && memberInfos[1].equals(memberPW)) {
					
						members.remove(memberID);
						
						System.out.println("삭제 처리 이후:" + members.get(memberID));
					
					
				}else {
					System.out.println("존재하지 않는 ID 입니다. 다시 확인하세요.");
				}
				
				break;
				
			
				
			case MENU_END:
				System.out.println("Gooooooood bye");
				systemFlag = false;
				break;
				
			}
			
			
			
		}
		
		scanner.close();

	}

}
