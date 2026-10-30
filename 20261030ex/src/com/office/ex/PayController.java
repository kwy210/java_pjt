package com.office.ex;

import java.util.Scanner;

/*
 * 월급 지금 명령을 내린다.
 */
public class PayController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		Flag flag = new Flag();
		
		while (flag.stertSystemFlag()) {
			
			System.out.println("Please enter the month (나가기 는 0을 눌러 주세요)");
			int thisMonth = scanner.nextInt();
			
			if (thisMonth != 0) {
			
			PayService payService = new PayService();
			payService.pay(thisMonth);
			
			} else if(thisMonth == 0) {
				
			System.out.println("시스템 종료");
			scanner.close();
			}
		
	

		
	}
	
	}
}