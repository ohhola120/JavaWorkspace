package Ex9_Work;

import java.util.Random;

public class Work {
private static int[] number = new int[100];
private static int[] count = new int[10];

public static void gRN() {
	Random rand = new Random();
	for(int i=0; i<number.length; i++) {
		number[i]=rand.nextInt(10)+0;
	}
}

public static void cNum() {
	for(int num : number) {
		count[num]++;
	}
}
public static void pG() {
	for(int i=0; i<count.length; i++) {
		System.out.print(i+"의 갯수 : ");
		for(int j=0; j<count[i]; j++) {
			System.out.print("#");
		}System.out.println(" "+count[i]);
	}
}
public static void pN() {
	for(int i=0; i<number.length; i++) {
		System.out.print(number[i]);
		if((i+1)%20==0)System.out.println();
	}
	
}

}
