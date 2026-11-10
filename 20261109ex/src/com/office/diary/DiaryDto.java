package com.office.diary;

public class DiaryDto {

	private String diaryTitle;
	private String diaryBody;
	
	
	public DiaryDto(String diaryTitle, String diaryBody) {
		super();
		this.diaryTitle = diaryTitle;
		this.diaryBody = diaryBody;
	}


	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}


	public void setDiaryBody(String diaryBody) {
		this.diaryBody = diaryBody;
	}
	
		
	
	
}
