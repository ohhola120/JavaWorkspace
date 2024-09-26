package Ex5_class_array;

import java.util.Scanner;

public class VandingMain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	Vending ven = new Vending();
	ven.init();
	
	System.out.print("insert coin : ");
	ven.showCans(sc.nextInt());
	
	System.out.print(">> ");
	ven.selsctCan(sc.next() );
}
}
