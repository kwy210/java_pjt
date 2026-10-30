package com.office.ex;

public class Daeri {
	
	//속성
	public String name = "Kim Daeri";
    private	int money;
	
	
	public Daeri() {
		money = 1000000;
	}
	
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료.");
	}
	
	public void setMoney(int money, String ceoPW) {
		if (ceoPW.equals("1234")) {
			this.money = money;
		}
		
	} // 우회해서 대리의 money 를 바꿈
	
	public int getMoney() {
		return this.money;
	} //속성이 많으면 코딩에 너무 많은 시간이 걸림
	
	//정리하자면 속성은 프라이빗이 맞다 (보안)
	

	
	
	
}
