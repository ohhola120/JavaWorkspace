package Ex2_override;

public class Snake extends Animal {

	String sensor = "밤에도 잘 봅니다";
	
	//메서드 오버라이딩
	//'메서드의 재 정의'의 의미를 가지며, 상속관계의 객체에서
	//부모의 함수를 가져와 자식 사정에 맞게 ㅈ재정의 하는것
	@Override
	public int getLeg() {
		return 0;
	}
	

	
	
	
}