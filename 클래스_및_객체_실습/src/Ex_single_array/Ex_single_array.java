package Ex_single_array;

import java.util.Scanner;

public class Ex_single_array {
	public static void main(String[] args) {
		
		
		//학생들의 성적을 입력받고, 평균성적 이상인 학생들의 수와
		//평균 이상인 학생들의 번호를 출력
		//----------------------------
		//학생 수 : 3
	    //학생 1 : 90
		//학생 2 : 75
		//학생 3 : 84
		//---------
		//평균 성적 : 83.0
		//--평균성적 이상인 학생들--
		//=>학생 1
		//=>학생 2
		//평균 이상 학생의 수 : 2
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 :");
		int a = sc.nextInt();
		
		int[] grades = new int[a];
		int sum = 0;
		float average = 0;
		for(int i=0; i<grades.length; i++) {
			System.out.printf("학생%d : ",(i+1));
			grades[i] =sc.nextInt();
			sum +=grades[i];
		}//for
		//평균
		average = (float)sum / a;
		System.out.printf("평균성적 : %.1f\n", average);
		
		//평균 이상인 학생 정보
		System.out.println("---평균 이상의 학생등---");
		
		int avgCnt = 0;
		
		for(int i=0; i<grades.length; i++) {
			
			if(grades[i]>=average) {
				avgCnt++;
				System.out.printf("=> 학생%d : %d\n", i+1, grades[i] );
			}
			
		
			
			
		}System.out.println("평균 이상인 학생 수 : " + avgCnt);
		
		
	}//main

}
