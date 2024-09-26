package Ex9_Work;

import java.util.Random;
import java.util.Scanner;

public class NumMain {
public static void main(String[] args) {
	//1~9사이의 난수 세개를 중복 되지 않도록 생성하고
	//키보드에서 입력받은 값으로 strike , ball
	//ex) 난수 = 591
	//입력 : 584
	//1Strike 0Ball -> if 숫자와 자리가 같다면 Strike 
	//입력 : 352
	//1Strike 1Ball -> if 숫자가 같지만 위치가 다르면 Ball
	//입력 : 284
	//OUT -> 숫자가 하나도 같지 않다면 OUT
	//입력 : 591
	//정답입니다.
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<3; i++) {
	char n = (char)(new Random().nextInt(10)+48);
	
	}//for
	while(true){
		System.out.println("입력 : ");
		String str = sc.next();
		
			
	 
	 

	}//while

	/*
	import java.util.Random;
	import java.util.Scanner;

	public class BaseballGame {
	    public static void main(String[] args) {
	        // 중복되지 않는 1~9 사이의 난수 3개 생성
	        char[] randomNumbers = new char[3];
	        Random random = new Random();

	        for (int i = 0; i < 3; i++) {
	            randomNumbers[i] = (char) (random.nextInt(9) + 49); // ASCII 코드 49부터 57까지 ('1'부터 '9')
	            // 중복 체크
	            for (int j = 0; j < i; j++) {
	                if (randomNumbers[i] == randomNumbers[j]) {
	                    i--; // 중복 발생 시 다시 뽑기
	                    break;
	                }
	            }
	        }

	        // 난수 확인용 (디버깅 시 사용)
	        // System.out.println("난수: " + new String(randomNumbers));

	        Scanner scanner = new Scanner(System.in);
	        boolean isCorrect = false;
	        int attempts = 0;

	        while (!isCorrect) {
	            attempts++;
	            System.out.print("세 자리 숫자를 입력하세요: ");
	            String input = scanner.nextLine();

	            // 입력값이 세 자리인지 체크
	            if (input.length() != 3) {
	                System.out.println("세 자리 숫자를 입력하세요.");
	                continue;
	            }

	            // 입력값을 숫자로 변환
	            char[] userNumbers = input.toCharArray();

	            // 스트라이크와 볼 카운트
	            int strike = 0;
	            int ball = 0;

	            for (int i = 0; i < 3; i++) {
	                if (userNumbers[i] == randomNumbers[i]) {
	                    strike++;
	                } else {
	                    for (int j = 0; j < 3; j++) {
	                        if (userNumbers[i] == randomNumbers[j] && i != j) {
	                            ball++;
	                        }
	                    }
	                }
	            }

	            // 결과 출력
	            if (strike == 3) {
	                System.out.println("정답입니다! " + attempts + "번 만에 맞추셨습니다.");
	                isCorrect = true;
	            } else if (strike == 0 && ball == 0) {
	                System.out.println("OUT");
	            } else {
	                System.out.println(strike + " Strike, " + ball + " Ball");
	            }
	        }

	        scanner.close();
	    }
	} */
	
}
}