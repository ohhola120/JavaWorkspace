package Ex2_Overloading;

import java.util.Scanner;

public class BreadMain {
public static void main(String[] args) {
	//1)makeBread()
	//빵을 만들었습니다
	//2)makeBread()
	//빵을 만들었습니다
	//빵을 만들었습니다
	//2개의 빵을 만들었습니다
	
	//3)makeBread()
	//크림빵을 만들었습니다.
	//크림빵을 만들었습니다.
	//2개의 크림빵을 만들었습니다
	
	Bread ac =new Bread();

	ac.makeBread();
	System.out.println("------------------");
	ac.makeBread(3);
	System.out.println("--------------------");
	ac.makeBread("크림빵",2);

}//main

}
