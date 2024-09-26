package Ex8_work;

import java.util.Scanner;
import java.util.ArrayList;
public class Workmain {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		Work ac = new Work();
		System.out.print("관광객 수: ");
        int numTourists = sc.nextInt();
        for (int i = 0; i < numTourists; i++) {
            System.out.print((i + 1) + ". 이름: ");
            String name = sc.next();
            System.out.print((i + 1) + ". 나이: ");
            int age = sc.nextInt();
            System.out.print((i + 1) + ". 방문 장소: ");
            String place = sc.next();
            ac.addTourist(new WorkReceive(name, age, place)); 
        }

        while (true) {
            System.out.println("1. 관광객 정보");
            System.out.println("2. 방문 장소 변경");
            System.out.println("etc. 종료");
            System.out.print("> ");
            int choice = sc.nextInt();

            if (choice == 1) {
                ac.printAllInfo(); // 
            } else if (choice == 2) {
                System.out.print("어디로 변경? ");
                String newPlace = sc.next();
                System.out.print("몇 번째 관광객? ");
                int index = sc.nextInt();
                ac.changePlace(index, newPlace);  
            } else {
                break;
            }
        }
    }
}