package Ex3_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workmain {
	public static void main(String[] args) {

		// ArrayList를 활용하여
		// 고객의 인적사항을 추가, 삭제, 조회하는 코드를 작성
		// ----------------------------
		// 1. 정보 추가
		// 2. 정보 삭제
		// 3. 전제 정보 보기
		// etc. 종료
		// >> 1
		// 이름 : 김
		// 나이 : 20
		// 전화 : 010-0000-0000
		// 정보 저장 성공
		// 1. 정보 추가
		// 2. 정보 삭제
		// 3. 전제 정보 보기
		// etc. 종료
		// >> 3
		// --전체 정보--
		// 등록 인원 1
		// 김 / 20 / 010-0000-0000
		Scanner sc = new Scanner(System.in);
		List<Work> list = new ArrayList<Work>();

		while (true) {

			System.out.println("1.정보 추가");
			System.out.println("2. 정보 삭제");
			System.out.println("3. 전체 정보 보기");
			System.out.println("etc. 종료");
			System.out.print(">> ");
			int a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.print("이름 :");
				String name = sc.next();
				System.out.print("나이 :");
				int age = sc.nextInt();
				System.out.print("전화 :");
				String call = sc.next();

				Work work = new Work();

				work.setName(name);
				work.setAge(age);
				work.setCall(call);
				list.add(work);
				System.out.println("정보 저장 성공");
				break;
			case 2:
				System.out.print("삭제할 이름 : ");
				name = sc.next();
				boolean b = false;

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println("정보 삭제 완료");
						b = true;
						break;
					}
				}
				if (!b) {
					System.out.println("정보가 없습니다.");
				}
				break;

			case 3:
				System.out.println("전체 정보 ");
				for (Work w : list) {
					System.out.println("이름 : " + w.getName());
					System.out.println("나이 : " + w.getAge());
					System.out.println("번호 : " + w.getCall());
				}
				break;

			default:
				System.out.println("프로그램 종료");
				sc.close();
				return;

			}// switch

		} // while

	}// main
}
