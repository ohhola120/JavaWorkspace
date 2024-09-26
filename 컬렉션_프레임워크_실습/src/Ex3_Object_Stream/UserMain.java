package Ex3_Object_Stream;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 새로 등록");
		System.out.println("2. 불러 오기");
		System.out.println(">> ");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("이름 : ");
			user.setName(sc.next());
			System.out.println("나이 : ");
			user.setAge(sc.nextInt());
			System.out.println("전화 : ");
			user.setTell(sc.next());

			InfoWriter iw = new InfoWriter();
			iw.writerInfo(user);

			break;

		case 2:
			System.out.println("전화 : ");
			InfoLoader il = new InfoLoader();
			user = il.loadInfo(sc.next());

			if (user != null) {
				System.out.println("이름 : " + user.getName());
				System.out.println("나이 : " + user.getAge());
				System.out.println("전화 : " + user.getTell());
			}
			break;
		}// switch

	}// main
}
