package Ex1_computer;

public class Computer {
	// 변수 ,속성, 멤버...
	int ssd = 256;
	int ram = 128;
	float cpu = 2.4f;
	String color = "white";
	private String brand = "apple";

	// 메서드, 함수 ...
	// 메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
	// 반복적으로 사용되는 코드를 줄일 수 있다.
	
	//접근제한자   반환형    메서드명(파라미터(안자)) =>메서드 명은 항상 소괄호가 있다{메서드의 실행 영역}
	//public    void    infomation(){}
	public void infomation() {
		System.out.println("ssd :" + ssd);
		System.out.println("ram :" + ram);
		System.out.println("cpu :" + cpu);
		System.out.println("color :" + color);
		System.out.println("brand :" + brand);
		System.out.println("-------------------------");
	}
//접근제한자의 종류
	//1.public : 같은 프로젝트의 모든 클래스들에게 접근을 허용
	//2.private : 현재 클래스에서만 접근을 허용
	//3. protected : 상속 관계의 클래스에서만 접근을 허용
	//4. default : 같은 패키지의 클래스들에게 접근을 허용
}
