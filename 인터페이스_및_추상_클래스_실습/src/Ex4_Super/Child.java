package Ex4_Super;

public class Child extends Parent {
	public Child() {

		// super: 부모클래스
//super(); <--부모생성자
		// spuer.method(); <--qnahaptjem
		// super.name
		super(10);// 부모클래스의 생성자
		System.out.println("Child의 생성자");
	}

	@Override
	public int getValue() {
		// 부모의 getValue()를 호출하겠음
		// Parent.getValue();
		// return super.getValue();
		return super.getValue();
	}

	private void setValue(int value) {
		// Parent가 가진 value변수에 값을 대입
		super.value = value;
	}

}
