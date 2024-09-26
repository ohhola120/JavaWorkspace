package Ex6_atm;

import java.util.Scanner;

import Ex4_class_array.Person;

public class UserMain {
	public static void main(String[] args) {

		/*
		 * 1. 입금 2. 출금 3. 잔액 확인 etc.종 료 >> 1 --입 금-- 입금액 : 1000 입금성공 ----------- 1. 입금
		 * 2. 출금 3. 잔액 확인 etc.종 료 >> 3 --잔액 확인-- 1000원 ----------
		 */
		/* Atm[] a = new Atm[3];
	
		a[0] = new Atm();
		a[1] = new Atm();
		a[2] = new Atm();

		a[0].setNumber("1. 입금");
		a[1].setNumber("2. 출금");
		a[2].setNumber("3. 잔액확인");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].getNumber());
		} */
//		Atm n1 = new Atm();
//		n1.num(" ");
		Scanner sc = new Scanner(System.in);
		
		
		w: while(true) {
			System.out.println("1. 입  금");
			System.out.println("2. 출  금");
			System.out.println("3. 잔액확인");
			System.out.println("etc. 종료");
			
			int sel= sc.nextInt();
			
			switch(sel) {
			case 1://입금
				System.out.println("---입금---");
				System.out.println("입금액 : ");
				System.out.println(sc.nextInt());
				break;
			case 2://출금
				System.out.println("---출금---");
				System.out.println("출금액 : ");
				System.out.println(sc.nextInt());
				break;
			case 3://잔액확인
				System.out.println("---잔액---");
				atm.balance();
				break;
			case 4://종료
				System.out.println("종료합니다");
				break W;
				
			}
					
			
		}

	}// main
}
