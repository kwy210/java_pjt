package com.office.diary;

import java.util.ArrayList;

public class DiaryDao {
	
	//새로 배운것 [] -> 길이X ====> Array List
	
	private ArrayList<String> diaries = new ArrayList<String>();

	public boolean insertDiary(DiaryDto diaryDto) {
		int beforSize = diaries.size();
		
//		diaries.add(diaryDto.getTxt());
		
		diaries.add(0, diaryDto.getTxt());
		
		int afterSize = diaries.size();
		
		
		return afterSize > beforSize ? true : false;
		
		
	}
	
	
	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
}
