package com.office.ex;
/*
 * 월급 지급 명령을 내린다.
 * 
 * 월급 지급 처리 프로그램
 * 
 * 누적된 급여 지급 횟수
 */
public class PayService {

	Daeri daeri;
	Gwajang gwajang;
	Chajang chajang;
	
	 public PayService() {
		 daeri = new Daeri();
		 gwajang = new Gwajang();
		 chajang = new Chajang();
		 
		// daeri.money = 0;   //private 선언시 대리.머니 객체를 찾아가는게 불가능
		 // CEO 비밀번호가 :1234
		 daeri.setMoney(1200000, "1234"); // 우회해서 대리의 money 를 바꿈
		 
		 // 누구나 월급 조회
		 System.out.println("김대리 월급: "+ daeri.getMoney());
		 
	} 
		
	public void pay(int month) {
		daeri.pay();
		gwajang.pay();
		chajang.pay();
		
		System.out.println(month + "월 급여 지급 완료.");
		
		PayCount.getPayCountInstance().setCnt();
		
		//누적 급여 횟수 출력
		
		int cnt = PayCount.getPayCountInstance().getCnt();
		System.out.println(cnt + "누적 급여 횟수.");
		
	}
	
	
	
	
}
