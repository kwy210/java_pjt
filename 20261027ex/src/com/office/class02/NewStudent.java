package com.office.class02;

public class NewStudent {

	//멤버 필드
	int grade = 1;             // 학년
	int classNo;	       // 반번호
	int studentNo;         // 학생 개인 번호
	String studentName;	   // 학생 이름
	boolean absence = false;		// 휴학 구분 (true: 휴학, false:재학)
	
	/*
	 * 생성자 오버로딩이란, 생성자가 과적(넘쳐요)했다는 의미입니다.
	 */
	
	//생성자
	public NewStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public NewStudent(
			int grade,
			int classNo,
			int studentNo,
			String studentName,
			boolean absence) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}

	public NewStudent(
			int classNo,
			int studentNo,
			String studentName,
			boolean absence) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}

	public NewStudent(
			int classNo,
			int studentNo,
			String studentName) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}


	public NewStudent(int grade, int classNo, int studentNo, String studentName) {
		super();
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	//매서드
	public void printInfo() {
		System.out.println("학년:"+ grade);
		System.out.println("반번호:"+ classNo);
		System.out.println("학생 개인 번호:"+ studentNo);
		System.out.println("학생 이름:"+ studentName);
		System.out.println("휴학 구분:"+ absence);
		
	}

	

}
