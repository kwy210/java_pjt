package com.office.diary;

public class DiaryDto {

	private String diaryTitle;
	private String diaryBody;
	
	public DiaryDto() {
		// TODO Auto-generated constructor stub
	}
	
	public DiaryDto(String diaryTitle, String diaryBody) {
		super();
		this.diaryTitle = diaryTitle;
		this.diaryBody = diaryBody;
	}

	

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public String getDiaryBody() {
		return diaryBody;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}


	public void setDiaryBody(String diaryBody) {
		this.diaryBody = diaryBody;
	}
	
		
	
	
}
