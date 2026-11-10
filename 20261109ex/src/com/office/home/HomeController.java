package com.office.home;


import java.util.Scanner;

import com.office.Container;
import com.office.menu.Menu;

public class HomeController {

	

	public void execute() {

		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			
		Menu.generateMenu();
			
		int selectedMenu = scanner.nextInt();
			
		switch (selectedMenu) {
		case Menu.MEMBER_SIGN_UP:
		case Menu.MEMBER_SIGN_IN:
		case Menu.MEMBER_SIGN_OUT:
		case Menu.MEMBER_MODIFY:	
		case Menu.MEMBER_DELETE:
			Container.getInstance().getMemberController().execute(scanner, selectedMenu);			
			break;
		
		case Menu.DIARY_READ:
		case Menu.DIARY_WRITE:
			Container.getInstance().getDiaryController().execute(scanner, selectedMenu);
			break;
			
		case Menu.SYSTEM_OUT:
			systemFlag = false;
			System.out.println("시스템 종료");
			break;
		}
		
		
		
		}

		scanner.close();
		
	}

}
