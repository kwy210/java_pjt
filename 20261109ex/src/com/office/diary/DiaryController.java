package com.office.diary;

import java.util.ArrayList;
import java.util.Scanner;

import com.office.config.Config;
import com.office.menu.Menu;
import com.office.session.Session;

public class DiaryController {

	final private DiaryService diaryService;
	
	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}

	

	public void execute(Scanner scanner, int selectedMenu) {
		
		String diaryTitle;
		String diaryBody;
		
		switch (selectedMenu) {
		case Menu.DIARY_WRITE:
			
			scanner.nextLine();
			
			System.out.println("일기 제목");
			diaryTitle = scanner.nextLine();
			
			System.out.println("일기 내용");
			diaryBody = scanner.nextLine();
			
			DiaryDto diaryDto = new DiaryDto(diaryTitle, diaryBody);
			
			int resultForWrite = diaryService.writeDiary(
				String.valueOf(Session.getInstance().getAttribute(Config.SIGINED_MEMBER_ID)),
				diaryDto);
					
			if (resultForWrite == DiaryService.DIARY_WRITE_SUSSES) {
				System.out.println("일기 쓰기 성공");
				
			} else {
				System.out.println("일기 쓰기 실패");
			}
				
			break;

		case Menu.DIARY_READ:
			
			ArrayList<DiaryDto> myDiary = diaryService.readDiaries(
				String.valueOf(Session.getInstance().getAttribute(Config.SIGINED_MEMBER_ID)) 
					);
			
			if (myDiary != null) {
				
				for (int i = 0; i < myDiary.size(); i++) {
					
					DiaryDto dto = myDiary.get(i);
					System.out.println("---------------------------");
					System.out.println("Title: "+ dto.getDiaryTitle());
					System.out.println("Body: "+ dto.getDiaryBody());
					System.out.println("---------------------------");
					}
				
				} else {
					System.out.println("일기가 없어요");
				}
				
				break;
			}
			
			
		}
		
}