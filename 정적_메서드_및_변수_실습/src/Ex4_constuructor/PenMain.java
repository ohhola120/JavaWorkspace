package Ex4_constuructor;

public class PenMain {
public static void main(String[] args) {
	Pen p1 = new Pen();
	
	Pen p2=new Pen("gold");
	//생성자는 new와 함께 사용된 이후, 재 호출 불가
	//p2.Pen();
	System.out.println(p2.getColor());
	
	Pen p3=new Pen(500,"black");
}
}
