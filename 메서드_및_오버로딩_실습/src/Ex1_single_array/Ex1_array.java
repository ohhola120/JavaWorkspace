package Ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {

		// 배열 : 같은 자료형 끼리 모아둔 하나의 묶음
		// 효율적인 자료관리를 위해 반드시 필요
		int n1 = 100;
		int n2 = 200;
		int n3 = 300;
		int n4 = 400;

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		System.out.println("-------------------------------");
		
		//1)배열 선언
		int[]arr;
		//2)배열 생성
		arr = new int[4];
		
		//3)초기화
		//초기화를 하지 않으면
		//정수->0, 문자-> ' ', 문자열-> null, 실수 -> 0.0으로 초기화가 된다
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;

		//존재하지 않는 index에 값을 넣을 수 없다
		//arr[4] = 500;
		//배열의 선언, 생성, 초기화를 한 번에
		//int[] arr2 = { 10, 20, 30 ,40};
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//for
		
		System.out.println("---------------------------------");
		int[]arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		//arr2[3] = 40;
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (i+1) * 10;
			System.out.println(arr2[i]);
		}
		

	}// main
}
