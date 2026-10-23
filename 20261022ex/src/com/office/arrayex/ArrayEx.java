package com.office.arrayex;

public class ArrayEx {

	public static void main(String[] args) {
		
		/*
		 * 배열 선언
		 */
		
		/*
		 * 1. 데이터타입[] 배열변수명 = {...} ;
		 */
		int[] numvers1 = {1, 2, 3, 4, 5}; // numvers라는 배열 선언 = 초기화
		
		/*
		 * 2. 데이터타입[] 배열변수명 = new 데이터타입[배열의길이] 
		 */
		int[] numbers2 = new int[5];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		
		/*
		 * 3. 데이터타입[] 배열변수명 = new 데이터타입[]{...};
		 */
		int[] numbers3 = new int[] {1, 2, 3, 4, 5};
		
		/*
		 *배열 데이터 조회: 인덱스를 이용한 데이터 조회
		 */
		int[] scores = {80, 90, 100, 75, 60};
		System.out.println(scores[0]); //80
		System.out.println(scores[1]); //90
		System.out.println(scores[2]); //100
		System.out.println(scores[3]); //75
		System.out.println(scores[4]); //60

		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] : %d\n", i, scores[i]);
		}
		
		/*
		 * 배열 데이터 수정: 인덱스(index)를 이용한 데이터 수정
		 */
		int[] points = {80, 70, 100, 60, 90};
		for(int i = 0; i < points.length; i++) {
			System.out.printf("points[%d]: %d\n", i,points[i]);
		}
		
		//foreach
		for (int point : points) {
			System.out.println("point:" + point);
		}
		
		points[0] = 800;
		System.out.println("points[0]:"+ points[0]);
		
		/*
		 * Java의 배열 특징
		 * 
		 * 1.배열은 단일 데이터타입만 저장 가능하다.
		 * let nums = [10, 20, 30, 'hello']; = 자바 스크립트 방식 자바에서는 안됨
		 * 
		 * 2. 최초 선언된 배열의 길이는 변경 불가하다.
		 * 
		 * 3. 존재하지 않는 인덱스를 이용하게 되면 에러 발생한다.
		 */
		
		
		int[] ns = {1, 2, 3}; // length: 3
		
//		ns = new int[5];
		
		System.out.println(ns[2]); // 3
//		System.out.println(ns[3]); //에러 발생
		System.out.println("++++++++");
		
		/*
		 * 배열을 이용해서 학생의 시험 성적, 총점, 평균을 출력하자!
		 */
		int[] studentScores = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};
		int total = 0;         //총점
		float average = 0.0f;  //평균
		
		for (int i = 0; i < studentScores.length; i++) {
			//학생 개인 점수
			System.out.printf("studentScores[%d] score: %d \n", i ,studentScores[i]);
			
			//총합
			total += studentScores[i];
		}
		// 총합 출력
		System.out.println("Total score:" + total);
		
		// 평균 출력
		average =(float) total / studentScores.length;
		System.out.println("Average: "+ average);
		
		// 값이 없는 배열의 초기값은?
		int[] classes = new int[5];
		for (int i = 0; i < classes.length; i++) {
			System.out.println(classes[i]);
		}
		
		float[] averages = new float[5];
		for (int i = 0; i < averages.length; i++) {
			System.out.println(averages[i]);
		}
		
		/*
		 * 배열 복사
		 */
		int number1 = 10;
		int number2 = 20;
		
		System.out.println("number1:"+ number1); // number1:10
		System.out.println("number2:"+ number2); // number2:20
		
		number2 = number1;
		
		System.out.println("number1:"+ number1); // number1:10
		System.out.println("number2:"+ number2); // number2:10
		
		number1 = 100;
		System.out.println("number1:"+ number1); // number1:100
		System.out.println("number2:"+ number2); // number2:10
		
		int[] numbers = {1, 2, 3};
		int[] numbersCopy = numbers;
		
		System.out.println("numbers:"+ numbers); //numbers:[I@12edcd21 = 메모리 주소
		System.out.println("numbersCopy:"+ numbersCopy); //numbersCopy:[I@12edcd21
		
		for (int i =0; i < numbersCopy.length; i++) {
			System.out.printf("numbersCopy[%d]: %d\n", i, numbersCopy[i]);
		}
		
		numbers[0] = 100;
		System.out.println(numbersCopy[0]); // 100
		
		//깊은 복사
		//int[] numbers = {1, 2, 3};   ----> int[] numbersDeepCopy
		int[] numbersDeepCopy = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			numbersDeepCopy[i] = numbers[i];
		}
		for(int i = 0; i < numbersDeepCopy.length; i++) {
			System.out.printf("numbersDeepCopy[%d]: %d\n", i, numbersDeepCopy[i]);
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
		}
		
		numbersDeepCopy[2] = 3000;
		
		System.out.println("numbers[2]: "+numbers[2]);
		System.out.println("numbersDeepCopy: "+numbersDeepCopy[2]);
		
		//배열 삭제 
		int[] myScores = {80, 90, 100};
		System.out.println("myScores: "+ myScores); //메모리 주소
		
		myScores = null;
		System.out.println("myScores: "+ myScores); // null
		
		// 다 차원 배열
		
//		//2차원 배열
//		int[][] mns = new int[3][2];
//		System.out.println("mns: "+ mns); // 메모리 주소 = [[I@5b6f7412
		
		/*
		 * int[]myScores == int myScores[]
		 * int[][]mns == int mns[][]
		 */
		
		
		// 1
//		int[][] mns = {{1,2}, {10,20}, {100,300}}; // 3x2
		
		//2
//		int[][] mns = new int[3][2];
//		mns[0][0] = 1;
//		mns[0][1] = 2;
//		mns[1][0] = 10;
//		mns[1][1] = 20;
//		mns[2][0] = 100;
//		mns[2][1] = 200;
		
		int[][] mns = new int[][] {{1,2}, {10,20}, {100,200}};
		
		// 데이터 조회
		System.out.println(mns[0]); // 2차원 배열의 주소[I@5b6f7412
		System.out.println(mns[0][0]); // 2차원 배열값 1
//		System.out.println(mns[0][2]); // 오류 없는방에 접속함
		
		mns[0][0] = 1000;
		System.out.println(mns[0][0]); // 1000

		
		
		
	}

}
