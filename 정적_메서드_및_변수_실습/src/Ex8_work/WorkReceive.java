package Ex8_work;

public class WorkReceive {
	String name;
	int age;
	String place;

	public WorkReceive(String name, int age, String place) {
		this.name = name;
		this.age = age;
		this.place = place;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("목적지 : " + place);
		System.out.println("----------------------");
	}

	public void cPlace(String newPlace) {
		this.place = newPlace;
	}
}
