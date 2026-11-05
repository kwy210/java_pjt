package com.office.diary;

import java.util.Scanner;

public class DiaryController implements IDiaryConfig {

	final private DiaryService diaryService;
	
	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systmeFalg = true;
		
		while (systmeFalg) {
			System.out.println("1.쓰기  2.읽기  99.시스템 종료");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case DIARY_WRITE:
				
				scanner.nextLine();
				
				System.out.println("INPUT NEW DIARY TXT!!");
				String txt = scanner.nextLine();
				
				DiaryDto diaryDto =new DiaryDto(txt);
				diaryDto.insertDiary(DiaryDto);
				
				diaryService.writeNewDiary();
				
				break;
			case DIARY_READ:
				
				break;
			case SYSTEM_OUT:
				systmeFalg = false;
				break;

			
			}
			
			
		}
		
		scanner.close();
	}

	
	
	
}
