package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {

	final private MemberService memberService;
			
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFalg = true;
//		MemberService memberService = new MemberService();
	
		if (IS_DEV) 
			 new MemberDumy().signUpForDumy(memberService);
			
		// 메뉴처리
		
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		while (systemFalg) {
			System.out.println("1.SIGN_UP  2.SIGN_IN  3.MODIFY  4. DELTE  99.SYSTEM_OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				
				System.out.println("Input new member ID!!");
				memId = scanner.next();
				
				System.out.println("Input new member PW!!");
				memPw = scanner.next();
				
				System.out.println("Input new member Mail!!");
				memMail = scanner.next();
				
				System.out.println("Input new member Phone!!");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				break;
				
			case SIGN_IN:
				
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				

				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.signIn(memberDto);
				
				break;
				
			case MODIFY:
				/*
				 * ID, Pw --> 인증 OK --> PW, Mail, phone 수정한다
				 */
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
		Boolean isAuthentication =
				memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if (isAuthentication) {
					System.out.println("Input member PW!!");
					memPw = scanner.next();
					
					System.out.println("Input member Mail!!");
					memMail = scanner.next();
							
					System.out.println("Input member Phone!!");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modify(memberDto);
				}
				
				
				
				break;
				
			case DELETE:
				/*
				 * 아이디 비번 인증 후 삭제
				 */
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				

				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.delete(memberDto);
				
				break;
				
			case SYSTEM_OUT:
				systemFalg = false;
				System.out.println("잘가요~");
				break;
				
			default:
				System.out.println("숫자를 넣어주세요");
				break;
			}
			
			
		}
		
		scanner.close();
		
	}
	
}
