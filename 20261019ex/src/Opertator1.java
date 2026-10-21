
public class Opertator1 {

	public static void main(String[] args) {
		
		/*
		 * 연산자 (Opertator)
		 * 산술연산자, 대입(복합) 연산자, 비교 연산자, 논리 연산자, 조건식 연산자 등등...
		 */
		
		
		/*
	       * 산술 연산자:   +, -, *, /, %, ++, --
	         할당 연산자:   =, +=, -=, *=, /=, %=, &=, |=
	         비교 연산자:   ==, !=, >, <, >=, <=
	         논리 연산자:   &&, ||, !
	       */

		//1. 덧셈 연산
		//1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1+num2:"+ (num1+num2)); //num1+num2:30
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		System.out.println("num3+num4:"+ (num3+num4)); //num3+num4:0.3
		
		//1-2. 문자열 덧셈
		String str1 = "Hello";
		String str2 = "world";
		System.out.println("str1+str2:"+ (str1+str2)); //str1+str2:Helloworld
		
		//1-3. 숫자 + 문자열 = 문자열 + 문자열 = 문자열(연결 연산자)
		System.out.println(10 + "Hello"); //10Hello
		System.out.println(3.14f + "Hello"); //3.14Hello
		
		//참고: 문자 덧셈
		System.out.println('A'+'B'); // 65 + 66 = 131
		System.out.println('가'+'나'); // 44032 + 45208 = 89240
		
		//2. 뺄셈
		//2-1. 숫자 뺄셈
		num1 = 10; num2 = 20;
		System.out.println("num1 - num2:" + (num1+num2)); //num1 - num2:30
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 - num4:" + (num3 - num4)); //num3 - num4:-0.1
		
		//2-2. 문자열 뺄셈 (X)
		str1 = "Hello"; str2 = "world";
		// System.out.println("str1 - str2:" + (str1 - str2)) //error
		
		//참고: 문자 뺄셈
		System.out.println('A'-'B'); // 65 - 66 = -1
		System.out.println('가'-'나'); // 44032 - 45208 = -1176
		
		//3. 곱셈
		num1 = 10; num2 = 20;
		System.out.println("num1 + num2:"+ (num1 + num2)); //num1 + num2:30
		
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 + num4:"+ (num3 + num4)); //num3 + num4:0.3
		
		System.out.println('A'*'B'); //4290
		System.out.println('가'*'나'); //1990598656
		
		//4. 나눗셈
		num1 = 10; num2 = 20;
		System.out.println("num1 / num2:"+ (num1 / (float)num2)); // 0.5 인데 num1 / num2:0 으로 나옴 (오버플로우)
		// 4바이트 / 4바이트 라서 강제 형 변환float를 하고 float는 아무곳에 넣어도됨   //num1 / num2:0.5
		
		num3 = 0.8f; num4 = 0.2f;
		System.out.println("num3 / num4 "+ (num3 / num4)); // num3 / num4 4.0
		
		
		System.out.println((int)'a'); //97
		System.out.println((int)'A'); //65
		System.out.println('a'/'A');  // 97 / 65 = 1.4923..... ==> 하지만 1 로나옴 
		
		System.out.println(0/100); // 0
		//System.out.println(100/0); // error
		
		//5. 나머지 연산자
		 num1=10; num2=3;
		 System.out.println("num1 % num2:" +(num1 % num2)); //num1 % num2:1
		 System.out.println('a' % 'A');// 32

		// byte (1바이트) ➡️ short (2바이트) / char (2바이트) ➡️ int (4바이트) ➡️ 
		// long (8바이트) ➡️ float (4바이트, 실수) ➡️ double (8바이트, 실수)

		 		 		
	}


}
