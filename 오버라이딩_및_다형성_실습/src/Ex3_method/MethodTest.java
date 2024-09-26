package Ex3_method;

public class MethodTest {

	public int test2(int n) {
		n++;
		System.out.println("n :" + n);
		//return을 통해 반환값을가지고 내가 호출되었던 곳으로 돌아간다.
		//이떄 반환형이 없는 void라면 빈손으로 돌아간다
		return n;
	}

	public void test1() {
		System.out.println("안녕하세요");
		return;

	}
}
