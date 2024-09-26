package Ex1_string;

public class Ex1_String {
public static void main(String[] args) {
	
	//String클래스의 두 가지 특징
	//1)객체 생성 방법이 두 가지(암시적, 명시적)
	//2)한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
	String s1="abc";//암시적 객체생성
	String s2="abc";
	String s3=new String("abc");//명시적 객체 생성
	//==은 객체간 비교에서는 값이 아닌 주소 비교 연산자
	if(s1==s3) {
	System.out.println("주소가 같습니다");	
	}else {
		System.out.println("주소가 다릅니다");
	}
	
	
	//equals()메서드를 총해 s1,s3의 '값'이 같은지 확인 가능
	if(s1.equals(s3)) {
		System.out.println("값이 같습니다");
	}
	String res="홍길동";
	res +="입니다";
	System.out.println(res);
	
	
	
	String ss1 = "abc";
	String ss2 = "abc";
	ss1="ab";
	System.out.println(ss1+ "/"+ss2);
}//main
}
