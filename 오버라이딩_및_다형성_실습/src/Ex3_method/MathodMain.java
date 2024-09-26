package Ex3_method;

public class MathodMain {
	public static void main(String[] args) {
		MethodTest m1 = new MethodTest();
		m1.test1();

		int su = 100;
		
		su = m1.test2(su);

		System.out.println("su:" + su);
	}// main
}
