package Ex1_inheritance;

public class ExtendsMain {
public static void main(String[] args) {
	
	Child c =new Child();
	//상속관계에서 자식 클래스는 부모가 가진 속성이나 
	//메서드를 마음대로 가져다 쓸 수 있다.
	System.out.println(c.str);
	
	Parent p = new Parent();
	//부모클래스는 자식의 속성이나 메서드를 마음대로 가져다 쓸 수 없다.
	//c라는 객체가 Parant와 인스턴스가 같은지(서로 부모자식 관계인지)확인
	if(c instanceof Object) {
		System.out.println("c는 Parant의 자식");
	}
	
}//main
}
