public class Operator3 {

	public static void main(String[] args) {
		
		/*
		 * 비겨 연산자
		 * 크고 작음을 나타내는 연산자 입니다.
		 */


		/*
		 * 비교 연산자
		 *
		 * [대소 비교]
		 *
		 * >  : 크다
		 *      A > B
		 *      A가 B보다 크면 true 반환
		 *      A가 B보다 작거나 같으면 false 반환
		 *
		 * >= : 크거나 같다
		 *      A >= B
		 *      A가 B보다 크거나 같으면 true 반환
		 *      A가 B보다 작으면 false 반환
		 *
		 * <  : 작다
		 *      A < B
		 *      A가 B보다 작으면 true 반환
		 *      A가 B보다 크거나 같으면 false 반환
		 *
		 * <= : 작거나 같다
		 *      A <= B
		 *      A가 B보다 작거나 같으면 true 반환
		 *      A가 B보다 크면 false 반환
		 *
		 * [동등 비교]
		 *
		 * == : 같다
		 *      A == B
		 *      A와 B가 같으면 true 반환
		 *      A와 B가 같지 않으면 false 반환
		 *
		 * != : 같지 않다
		 *      A != B
		 *      A와 B가 같지 않으면 true 반환
		 *      A와 B가 같으면 false 반환
		 */
		
		System.out.println(10 < 20); //true
		System.out.println(10 > 20); //false
		
		System.out.println(10 <= 20); //true
		System.out.println(10 >= 20); //false
		
		System.out.println(10 == 20); //false
		System.out.println(10 != 20); //true
		
		// ===, !== 는 자바스크립트 에만 있는 기호
		
		float num5 = 0.1f; //0.10000000149011612 > double
		double num6 = 0.1; //0.10000000000000000 > double
		
		System.out.println("num5:"+ num5); //num5:0.1
		System.out.println("num6:"+ num6); //num6:0.1
		
		System.out.println("num5 + num6:"+ (num5+num6)); // num5 + num6:0.20000000149011612
		
		System.out.println("num5 == num6 :"+ (num5 == num6)); //num5 == num6 :false
		System.out.println("num5 != num6 :"+ (num5 != num6)); //num5 != num6 :true
		
		System.out.println("num5 > num6 :"+ (num5 > num6)); //num5 > num6 :true
		System.out.println("num5 < num6 :"+ (num5 < num6)); //num5 < num6 :false
		
		
		int num7 = 10;
		float num8 = 10.0f;
		
		//int + float => float + float 로 변환 ==> num7: 10.0      num8: 10.0
		
		System.out.println("num7 > num8:"+ (num7 > num8));   // num7 >  num8:false
		System.out.println("num7 >= num8:"+ (num7 >= num8)); // num7 >= num8:true
		System.out.println("num7 < num8:"+ (num7 < num8));   // num7 <  num8:false
		System.out.println("num7 <= num8:"+ (num7 <= num8)); // num7 <= num8:true
		System.out.println("num7 == num8:"+ (num7 == num8)); // num7 == num8:true
		System.out.println("num7 != num8:"+ (num7 != num8)); // num7 != num8:false

		//******************아주 중요*********************
		//문자열 비교
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("str1 == str2:"+ (str1 == str2)); //str1 == str2:true
		
		// Scanner scanner = new Scanner(System.in);
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str3 == str4:"+(str3 == str4)); //str3 == str4:false
		
		System.out.println(str3.equals(str4)); // true //무조껀 이렇게 써야 문자열 
		
		
	}

}
