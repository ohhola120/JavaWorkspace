package Ex5_object;

public class ObjMain {
public static void main(String[] args) {
	
	ObjTest o1 =new ObjTest();
	String s ="Test";
	o1.setValue(s);
	
	//o1으로 부터  돌려받는 타입을 String으로 캐시팅하여 값을 전달할 수 있다.
	s=(String)o1.getValue();
	System.out.println(s);
	int su = 100;
	//AutoBoxing(자동형변환) : 기본자료형 -> Obejct
	o1.setValue(su);
	
	//Unboxing : Object -> 기본자료형
	int n=(int)o1.getValue();
	System.out.println(n);
	
	
}//main
}
