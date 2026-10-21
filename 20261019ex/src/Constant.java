
public class Constant {

	public static void main(String[] args) {
		
		/*
		 * 상수: "변하지 않은" 수
		 * final 키워드 사용한다.
		 */

		// 변수
		int num1 = 10;
		
		// 상수
		final int NUM2 = 20;
		
		System.out.println("num1:"+ num1); // num1:10
		System.out.println("NUM2:"+ NUM2); // NUM2:20
		
		final int PENCIL_PRICE = 1000;          // 정수
	      final float STUDENT_HEIGHT = 175.5f;    // 실수
	      final char GRADE = 'A';                 // 문자
	      final String COUNTRY = "Korea";         // 문자열

	      System.out.printf("PENCIL_PRICE : %d원 %n", PENCIL_PRICE); // PENCIL_PRICE : 1000원
	      System.out.printf("STUDENT_HEIGHT : %.2fcm %n", STUDENT_HEIGHT); // STUDENT_HEIGHT : 175.50cm 
	      System.out.printf("GRADE : %c등급 %n", GRADE); // GRADE : A등급 
	      System.out.printf("COUNTRY : %s %n", COUNTRY); // COUNTRY : Korea
	      
	      //이클립스에서 소문자와 대문자를 변환 하는 단축
	      // ctrl + shift + x ==> 대문자
	      // ctrl + shift + y ==> 소문자
	      
	      
	}

}
