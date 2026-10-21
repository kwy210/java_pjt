import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 데이터 타입 - 
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 되는데요,
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		 * 
		 * 메모리 단위
		 * • 1 bit(비트) > 메모리 최소 단위 (0 또는 1)
         * 8 bit(비트) > 1 byte(바이트) (영문자 1글자 저장)
         * 1,024 byte(바이트) > 1 KB(킬로바이트) (텍스트 문서 수준)
		 * 1,024 KB(킬로바이트) > 1 MB(메가바이트) (MP3 음악 1곡 수준)
		 * 1,024 MB(메가바이트) > 1 GB(기가바이트) (고화질 영화 1편 수준)
		 * 1,024 GB(기가바이트) > 1 TB(테라바이트) (PC 하드디스크 수준)
		 * 
		 * 언더플로우 = 언더플로우는 이미 정해진 메모리 공간 안에서 값이 표현할 수 있는 최솟값보다 더 작아져서 발생하는 계산상의 오류입니다.
		 */

		//정수 데이터 타입
		/*
		 * byte     1byte		-128 ~ 127
		 * short	2byte		-32,768 ~ 32,767
		 * int		4byte		-2,147,483,648 ~ 2,147,483,647 (약 -21억 ~ 21억)
		 * long		8byte		• -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (약 -922경 ~ 922경)
		 */
		
		byte btyeNum = 115;
		System.out.println("btyeNum:" + btyeNum); //btyeNum:115
		
		btyeNum = 127;
//		btyeNum = btyeNum + 1;
		
		byte btyeNum01 = -128;
		System.out.println("btyeNum01:" + btyeNum01); //btyeNum01:-128
		
		btyeNum01 =(byte)(btyeNum01 - 1);
		System.out.println("btyeNum01:" + btyeNum01); //btyeNum01:-129 (x) btyeNum01:127 (o) 
		
		short shortNum = 22768;
		System.out.println("shortNum:" + shortNum); //shortNum:22768
		
		int intNum = 1147483648;
		System.out.println("intNum:" + intNum); //intNum:1147483648
		
		// -2,147,483,648 ~ 2,147,483,647 (약 -21억 ~ 21억)
		int intNum01 = -2147483648;
		System.out.println("intNum01:" + intNum01); //intNum01:-2147483648
		
		intNum01 = intNum01 - 1;
		System.out.println("intNum01:" + intNum01); //intNum01:2147483647
		
		//             9,223,372,036,854,775,807
		long longNum = 7223372036854775808L;  //long 은 숫자뒤에 l,L 을 붙여한 한다
		System.out.println("longNum:" + longNum); //longNum:7223372036854775808
		
		//정수 데이터 타입의 최소값 최대값 보는법
		System.out.println("byte 최소값:" + Byte.MIN_VALUE); //byte 최소값:-128
		System.out.println("byte 최대값:" + Byte.MAX_VALUE); //byte 최대값:127
		
		System.out.println("short 최소값:" + Short.MIN_VALUE); // short 최소값:-32768
		System.out.println("short 최대값:" + Short.MAX_VALUE); // short 최대값:32767
		
		System.out.println("int 최소값:" + Integer.MIN_VALUE); // int 최소값:-2147483648
		System.out.println("int 최대값:" + Integer.MAX_VALUE); // int 최대값:2147483647
		
		System.out.println("long 최소값:" + Long.MIN_VALUE); // long 최소값:-9223372036854775808
		System.out.println("long 최대값:" + Long.MAX_VALUE); // long 최대값:9223372036854775807
		
		// 실수(부동소수점)
		/*
		 * float  = 4byte
		 * double = 8byte
		 */
		// float 은 숫자뒤에 f,F 를 붙인다
		float floatNum = 3.14f;
		System.out.println("floatNum:" + floatNum); //floatNum:3.14
		
		double doubleNum = 3.14159265358979;
		System.out.println("doubleNum:" + doubleNum); //doubleNum:3.14159265358979
		
		// E = 10의 거듭제곱
		// E38 = 10의38승 
		// E-45 = 10의 -45승(소수점 아래 0이 44개 있고 그 뒤에 숫자가 오는 아주 작은 수)

		System.out.println("float 최소값:" + Float.MIN_VALUE); //float 최소값:1.4E-45
		System.out.println("float 최대값:" + Float.MAX_VALUE); //float 최대값:3.4028235E38
		
		System.out.println("double 최소값:" + Double.MIN_VALUE); //double 최소값:4.9E-324
		System.out.println("double 최대값:" + Double.MAX_VALUE); //double 최대값:1.7976931348623157E308
		
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;
	    
	    System.out.println("num1:" + num1);
	    System.out.println("num2:" + num2);
	    
	    //논리 데이터 타입
	    // 참(true), 거짓(false)
	    //boolean  1byte    true,false
	    
	    boolean flag = true;
	    System.out.println("flag:" + flag); //flag:true
	    
	    //문자와 문자열 데이터 타입
	    //문자
	    /*
	     * 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 하입
	     * char   2byte  
	     * 문자는 작은 따옴표 '' 만 가능
	     */ 
	    char ch = 'a';
	 // char ch = "a";
	    System.out.println("ch:" + ch); //ch:a
	    
	    ch = 'b';
	    System.out.println("ch:" + ch); //ch:b
	    
	    //ch = 'hello';
	    
	    //빈문자(empty) vs  공백문자(space)
	    //char char1 = '';
	    //char char2 = ' ';
	    
	    // 문자는 메모리에 저장될 때 정수(유니코드)로 저장이 된다.
	    char char1 = 'A';
	    System.out.println("char1:" + char1); //char1:A
	    
	    int unicode = char1;
	    System.out.println("unicode:" + unicode); // unicode:65
	    
	    char char2 = 'ㄱ';
	    System.out.println("char2:" + char2); // char2:ㄱ
	    
	    unicode = char2;
	    System.out.println("unicode:" + unicode); // unicode:12593
	    
	    char char3 = 65;
	    System.out.println("char3:" + char3); //char3:A
	    
	    char3 = 12593;
	    System.out.println("char3:" + char3); //char3:ㄱ
	    
	    //문자열 
	    //String 
	    String str1 = "Hello";
	    System.out.println("str1:" + str1); //str1:Hello
	    
	    //str1= "";   //(o)
	    //str1 = " "; // (o)
	    
	    //콘솔을 이용한 데이터 입력, 출력
	    // 데이터 출력      // ln = line
	    System.out.print("hello python"); //hello pythonhello java
	    System.out.println("hello java"); 
	    
	    System.out.print("hello python\n"); // hello python  \n =개행(줄바꿈)
	    System.out.println("hello java"); //hello java
	    
	    String str = "hello";
	    System.out.println(str); // hello
	    
	    /*
	     * 특수 정리
	     * \n  개행(줄바꿈)
	     * \t  탭(4칸 공백)
	     * \'  작은 따옴표(')
	     * \" 큰 따옴표(")
	     * \\ 역 슬래쉬 (\)
	     */
	    
	    System.out.print("이름\t학번\n");          // 이름	학번
	    System.out.println("Mr.H\t2020_000123"); //Mr.H	2020_000123
	    System.out.println("Mr.k\t2020_000124"); //Mr.k	2020_000124
	    
	    System.out.println("어머님께서는\"밥먹고 설거지 해놔라.\"라고 하셨습니다."); // 어머님께서는"밥먹고 설거지 해놔라."라고 하셨습니다.
	    System.out.println("그래서 나는\'네'.\'라고 했습니다."); // 그래서 나는'네'.'라고 했습니다.
	    
	    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""); // \\\\\\\\\\\\\\\\\\\\\"
	    System.out.println("\\\\\\2020-08-01\\\\\\"); // \\\2020-08-01\\\
	    
	    // 데이터 입력
	    Scanner scanner = new Scanner(System.in); 
	    
	    //String inputStr = scanner.nextLine(); 
	   // System.out.println("inputStr:" + inputStr); // 콜솔창에 입력가능해짐 출력내용 -->  hello inputStr:hello 
	    
	    
	    /*
	    int inputInt = scanner.nextInt(); 				  //10
	    System.out.println("inputInt:"+ inputInt);		  //inputString: 10
	    
	    scanner.nextLine();                               // 청소역할 \n = Enter 버튼
	    
	    String inputString = scanner.nextLine();          //java
	    System.out.println("inputString:"+ inputString);  //inputString: java
	    
	    								//실제로 나온거		  //10
	    												  //inputInt:10
	                                                      //inputString:
	                                                      /// 
	    /// String inputString = scanner.nextLine();
	    /// String inputString = scanner.nextLine();
	    /// 이런구조면 1,2번줄 다인식 
	                                                      /// 
	                                                      /// 
	    */
	    
	    
	    String inputStrin = scanner.next();               //next 는 첫 공백 까지만 읽음
	    System.out.println("inputStrin:"+ inputStrin);    // hello java 입력 --> inputStrin:hello 자바는 날라감
	    
	    String inputString = scanner.nextLine();                 // java \n
	    System.out.println("inputString:"+ inputString); // java
	    
	    
	    scanner.close(); // 스케너 끄는 코드, 규모가 큰 코드면 먹통이될수있음 *중요*
	    
	    /*
	     * nextByte()    : 정수 입력
	     * nextInt()	 : 정수 입력
	     * nextLong()	 : 정수 입력
	     * nextFloat()	 : 정수 입력
	     * nextduble()	 : 실수 입력
	     * nextLine()	 : 문자열 입력
	     * nextBoolean() : 논리 입력
	     */
	    
	    
	    
	    
	} 

}
