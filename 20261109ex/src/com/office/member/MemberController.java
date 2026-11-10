package com.office.member;

import java.util.Scanner;

import com.office.config.Config;
import com.office.menu.Menu;
import com.office.session.Session;

public class MemberController {

	final private MemberService memberService;
	
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}


	public void execute(Scanner scanner, int selectedMenu) {
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		switch (selectedMenu) {
		case Menu.MEMBER_SIGN_UP:
			System.out.println("Input new member ID");
			memId = scanner.next();
			
			System.out.println("Input new member PW");
			memPw = scanner.next();
			
			System.out.println("Input new member MAIL");
			memMail = scanner.next();
					
			System.out.println("Input new member PHONE");
			memPhone = scanner.next();
			
			int resultForSignUp = memberService.singUp(
					new MemberDto(memId, memPw, memMail, memPhone));
			
			if (resultForSignUp == MemberService.SIGN_UP_SUCCESS) {
				System.out.println("회원가입 성공");
				
			} else {
				System.out.println("회원가입 실");
			}
					
			break;
		case Menu.MEMBER_SIGN_IN:
			System.out.println("Input new member ID");
			memId = scanner.next();
			
			System.out.println("Input new member PW");
			memPw = scanner.next();
			
		  MemberDto singnedMemberDto = memberService.singin(
					new MemberDto(memId,memPw,null,null));
			
		  if(singnedMemberDto != null) {
			System.out.println("로그인 성공");  
			Session.getInstance().
			setAttribute(
					Config.SIGINED_MEMBER_ID ,
					singnedMemberDto.getMemId());
			
		  } else {
			System.out.println("로그인 실패"); 
		  } 
		  
			break;
			
		case Menu.MEMBER_SIGN_OUT:
			
			Session.getInstance().removeAttribute(Config.SIGINED_MEMBER_ID);
			
			break;
		case Menu.MEMBER_MODIFY:
			
		MemberDto sinMemberDto = memberService.getMember();
			
		System.out.println("MemberID: "+ sinMemberDto.getMemId());
		System.out.println("MemberPW: "+ sinMemberDto.getMemPw());
		System.out.println("MemberMail: "+ sinMemberDto.getMemMail());
		System.out.println("MemberPhone: "+ sinMemberDto.getMemPhone());
		
		System.out.println("Input  member new PW");
		memPw = scanner.next();
		
		System.out.println("Input  member new MAIL");
		memMail = scanner.next();
				
		System.out.println("Input  member new PHONE");
		memPhone = scanner.next();
		
		int reultForModify =
				memberService.modify(new MemberDto(
						String.valueOf(Session.getInstance().getAttribute(Config.SIGINED_MEMBER_ID)),
						memPw,
						memMail,
						memPhone));
		
				
		if (reultForModify == MemberService.MODIFY_SUCCESS) {
			System.out.println("변경 성공");
		}else {
			System.out.println("변경 실패");
		}
				
			break;
		case Menu.MEMBER_DELETE:
			
		int reultForDelete = memberService.delete(
				String.valueOf(Session.getInstance().getAttribute(Config.SIGINED_MEMBER_ID))
				);
			
			if (reultForDelete == MemberService.DELETE_SUCCESS) {
				System.out.println("삭제 성공");
				Session.getInstance().getAttribute(Config.SIGINED_MEMBER_ID);
				
			}else {
				System.out.println("삭제 실패");
			}
			break;

		}
		
	}


	
	
}
