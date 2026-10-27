package com.office.class02;

import com.office.class01.Student;

public class MainClass {

	public static void main(String[] args) {
		
	NewStudent newStudent1 = new NewStudent(1, 1, 5, "박찬호", false);
	
	NewStudent newStudent2 = new NewStudent(1, 2, 8, "박지성", false);
	
	NewStudent newStudent3 = new NewStudent(2, 5, "박세리");
	
	NewStudent newStudent4 = new NewStudent(2, 7, 9, "김수지");
	
	NewStudent newStudent5 = new NewStudent(5, 4, "김연경");

	newStudent1.printInfo();
	System.out.println("---------------------------------");
	newStudent2.printInfo();
	System.out.println("---------------------------------");
	newStudent3.printInfo();
	System.out.println("---------------------------------");
	newStudent4.printInfo();
	System.out.println("---------------------------------");
	newStudent5.printInfo();
	
	NewStudent student6 = new NewStudent();
		
	}

}
