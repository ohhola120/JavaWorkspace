package Ex1_string;

public class Ex2_StringMethod {
public static void main(String[] args) {
	
	//Stirng클래스의 메서드(함수) 들
	//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
	//반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요
	String name = "Hong Gil Dong";
	name.length();
	int index = name.length();
	System.out.println("name의 길이 : "+index);
	
	name.indexOf('g');
	System.out.println("첫 문자g의 위치"+index);
	
	index=name.indexOf("Gil");
	System.out.println("문장 Gil의 위치"+index);
	
	index=name.lastIndexOf('g');
	System.out.println("마지막 문자 g의 위치 : "+index);
	
	char c=name.charAt(2);
	System.out.println("추출한 문자 : " + c);
	
	String sub =name.substring(5);
	System.out.println("추출한 문장 : "+sub);
	
	sub = name.substring(5,10);
	System.out.println("추출한 문장 : "+ sub);
	
	String fruit ="apple";
	if(fruit.equalsIgnoreCase("Apple")) {
		//equals() : 대소문자를 포함한 모든 값이 일치하는경우
		//equalsIgnoreCase() : 대소문자에 상관 없이 값이 일치하는 경우
		System.out.println("값이 같아요");
	}else {
		System.out.println("같이 달라요");
	}
	
	String id =" abc123 ";
	String id_check = id.trim();
	//문자열 앞뒤의 의미 없는 공백을 제거(중간 공백 제거는 불가능)
	if(id.equals("abc123")) {
		System.out.println("로그인 성공");
	}
	
	String number = "10";
	//정수형태의 문자열을 연산이 가능한 실제 정수로 바꿔주는 메서드
	int n = Integer.parseInt(number);
	System.out.println(n+10);
	//java에서 boolean,int등의 기본자료형을 쓸 수 있도록 해 주는
	//부모타입의 클래스를 Wrapper클래스라고 부른다
	//boolean->Boolean
	//char->Character
	//int->Integer
	//byte->Byte
	//short->Short
	//long->Long
	//float->Float
	//double->Double
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//main
}
