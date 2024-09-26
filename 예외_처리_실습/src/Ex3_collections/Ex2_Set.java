package Ex3_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_Set {

	public static void main(String[] args) {

		// HashSet을 이용하여 중복되지 않는 난수를 출력
		// 로또 번호 생성기 만들기(1~45)
		Random rc = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() < 6) {
			int a = rc.nextInt(45) + 1;
			hs.add(a);
		}

		Integer[] arr = hs.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------");

		TreeSet<Integer> ts = new TreeSet<Integer>();
		while (ts.size() < 6) {
			ts.add(rc.nextInt(45) + 1);
		}
		System.out.println(ts);
		
		System.out.println("--------------------");
		
		TreeSet<String> names = new TreeSet<String>();
		names.add("강하늘");
		names.add("john");
		names.add("adam");
		names.add("가길동");
		
		System.out.println(names);
		
	}

}
