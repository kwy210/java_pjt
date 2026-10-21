
public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 형식 문자열 지정자에 사용할수 있는 옵션들
		 */
		
		// 1.[.precision] : 소수점 아래 자리수를 지정한다.
		float rate = 3.14592f;
		System.out.printf("rate: %f %n", rate);  //rate: 3.145920
		System.out.printf("rate: %.2f %n", rate); //rate: 3.15
		System.out.printf("rate: %.4f %n", rate); //rate: 3.1459 
		
		// 2.[width] : 전체 출력 자리수를 지정하고, 오른쪽 정렬한다.
		int num1 = 1;
		int num2 = 12;
		int num3 = 123;
		
		System.out.printf("num1: %d %n", num1);  //num1: 1     
		System.out.printf("num2: %d %n", num2);  //num2: 12	  
		System.out.printf("num3: %d %n", num3);  //num3: 123	 
		
		System.out.printf("num1: %3d %n", num1); // num1:   1   = __1 = 001
		System.out.printf("num2: %3d %n", num2); // num2:  12	= _12 = 012
		System.out.printf("num3: %3d %n", num3); // num3: 123	= 123 = 123
		
		System.out.printf("num1: %-3d %n", num1); // num1: 1    = 1__ = 100 X
		System.out.printf("num2: %-3d %n", num2); // num2: 12 	= 12_ = 120 X
		System.out.printf("num3: %-3d %n", num3); // num3: 123	= 123
		
		
		// 3.[flags] : 전체 출력 자리수가 지정된 경우 빈칸을 0으로 채운다.
		
		int num4 = 1;
		int num5 = 12;
		int num6 = 123;
		
		System.out.printf("num4: %04d %n", num4); // num4: 0001  4칸/오른쪽 정렬 0001
		System.out.printf("num5: %04d %n", num5); // num5: 0012  4칸/오른쪽 정렬 0012
		System.out.printf("num6: %04d %n", num6); // num6: 0123  4칸/오른쪽 정렬 0123
		
		//4. [argument_index$] : 데이터 적용 위치를 지정한다. $(번호)
		
		int num7 = 1;
		int num8 = 2;
		int num9 = 3;
		int num10 = -1;
		
		System.out.printf("num7: %d, num8: %d, num9: %d, num10: %d %n", num7,num8,num9,num10 );
		// num7: 1, num8: 2, num9: 3, num10: -1 
		System.out.printf("num7: %2$d, num8: %4$d, num9: %3$d, num10: %1$d %n", num10,num7,num9,num8 );
		// num7: 1, num8: 2, num9: 3, num10: -1
		
		
		/*
		 *  형식 문자열 반환하기 : String.format() === (javasvript:``)
		 */
		String res = String.format("이름은 %s이고, 나이는 %d살입니다. %n", "홍길동", 20);
		System.out.println("res:" + res); // res:이름은 홍길동이고, 나이는 20살입니다. 
		
		//let str = "홍길동";
		//let age = 20;
		//let res = `이름은 %{str}이고, 나이는 %{age}살입니다.`;
		// console.log('res:', res);
		
		
		
	}

}
