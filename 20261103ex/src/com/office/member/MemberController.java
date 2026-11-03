package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {


	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFalg = true;
		MemberService memberService = new MemberService();
	
		
		
		while (systemFalg) {
			System.out.println("1.SIGN_UP  2.SIGN_IN  3.MODIFY  4. DELTE  99.SYSTEM_OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP:
				memberService.signUp(scanner);
				break;
			case SIGN_IN:
				memberService.signIn(scanner);
				break;
			case MODIFY:
				memberService.modify(scanner);
				break;
			case DELETE:
				memberService.delete(scanner);
				break;
			case SYSTEM_OUT:
				systemFalg = false;
				System.out.println("잘가요~");
				break;

			}
			
			scanner.close();
			
		}
		
	}
	
}
