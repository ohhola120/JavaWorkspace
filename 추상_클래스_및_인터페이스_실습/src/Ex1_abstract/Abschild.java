package Ex1_abstract;

public class Abschild extends AbsTest{

	@Override
	public void setValue(int n) {
		// TODO Auto-generated method stub
		//추상 클래스를 상속받은 자식 클래스는
		//부모가 가진 추상메서드를 무조건 가지고 있어야한다
		//자식클래스에서 쓸 일이 없어도 가지고는 있어야한다
		
		System.out.println(n);
	}

}
