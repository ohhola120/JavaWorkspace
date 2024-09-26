package Ex6_generic;



public class GenMain {
public static void main(String[] args) {
	Gen<String> gen = new Gen<String>();
	
	gen.setValue("hello");
	String s = gen.getValue();
	System.out.println(s);
	//제네릭타입은 기본 자료형을 인식하지 못하므로
	//int -> Integer
	//char -> Character
	//기본 자료형의 Wrapper클래스가 정의 되어야한다
	Gen<Integer> gen2 = new Gen<Integer>();
	gen2.setValue(100);
	int n = gen2.getValue(); 
	
	System.out.println(n);
	
	Gen<Character> gen3 = new Gen<Character>();
	gen3.setValue('A');
	char c =gen3.getValue();
	System.out.println(c);
	
	
	
	
	
}//main
}
