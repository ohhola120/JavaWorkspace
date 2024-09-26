package es2_value_type;

public class Ex1_valueType {
	public static void main(String[] args) {
		
		/* 
		   기본 자료형
		   1. 논리형 : boolean .. 1bit
		   2. 문자형 : char ..... 2byte
		   3. 정수형 : byte ..... 1byte (-128~127)
		             short .... 2byte (-32768~32767)
		             int ...... 4byte (-21억~21억) 주로 쓰는
		             long ..... 8byte (-900경~900경)
		   4. 실수형 : float .... 4.x byte
		             double.... 8.x byte
		              
		   */
		//변수 : 자료형과 함께 사용하며 값을 저장하는 공간
		//변수 선언 규칙
		//->자료형 변수명;(선언)
		//-> 변수명 = 값;(대입)
		//-> 자료형 변수명 = 값;(초기화)
		
		
		//변수명 작성 규칙
		//1. 숫자로 시작할 수 없다.
		//2. _를 제외하고 특수문자를 사용할 수 없다.
		//3. 한글을 사용하지 않는다.
		//4. 변수ㅡ이 첫글자는 반드시 소문자로 작성한다.
		
	//논리형
		//논리형은 true, false중 하나의 값만을 저장할 수 있다.
		boolean b1;
		b1 = true;
		b1 = false;
		System.out.println("b1 : " + b1);
    //문자형 : 홑따옴표 안에 딱 한글자만 저장할 수 있는 자료형
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		ch = 65 + 1;
		System.out.println("ch : " + ch);
		//ch는 수식은 아스키코드로 변경될 수 있다.
		
		//정수형
		//소수점이 없는 정수 데이터를 저장하는 자료형
		//byte b = 128; -> 표현 범위를 벗어나는 값은 담을 수 없다.
		int n = 2100000000;
		long lo = 2200000000L;
		long lo2 = 100;
		// long을 사용할 때 int의 범위값을 넘어갈 시 끝에 L을 입력해야한다 
		System.out.println("n : " + n);
		System.out.println("lo : " + lo);
		
		//실수형 
		//소수점을 가지고 있는 값을 저장하는 자료형
		float f = 3.14F;
		double d = 3.14;
		//float를 사용할 시 끝에 F를 입력해야한다 단 정수로 넣을 때에는 그냥 입력해도된다.(float에 정수가 들어갈 시 뒤에 .0이 붙게되는 원리)
		f = 100;
		d = 100;
		System.out.println(f + " / " + d);
		
		
		
		
		
	}

}
