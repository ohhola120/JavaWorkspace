package Ex3_set_get;

public class PersonMain {
public static void main(String[] args) {
	
	Person p1 = new Person();
	p1.setName("홍길동");
	p1.setAge(30);
	p1.setRegeon("");
	
	System.out.println(p1.getAge());
}//main
}
