package Ex4_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_ArrayList {
	public static void main(String[] args) {

		// id : aaa
		// [aaa]
		// id : bbb
		// [aaa,bbb]
		// id :aaa
		// 중복된 id
		// id : ccc
		// [aaa, bbb, ccc]
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id : ");
			String a = sc.next();
			list.add(a);
			System.out.println(list);
			break;
		}

		out: while (true) {
			System.out.println("id : ");
			String b = sc.next();

			if (list.contains(b)) {
				System.out.println("중복된 id입니다");
				continue out;
			} else {
				list.add(b);
				System.out.println(list);
			}

			
			
			
			
//			String id = sc.next();
//			w:for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).equals(id)) {
//					System.out.println("중복된 id");
//					continue w;
//				}
//			}
//			list.add(id);

		}
	}// main
}
