package Ex3_Work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {
public static void main(String[] args) {
	List<Work> list = new ArrayList<>();
	list.add(new Work("apple"));
	list.add(new Work("banana"));
	list.add(new Work("nigga"));
	
	Work selectedWork = list.get(new Random().nextInt(list.size()));
	
	try (Scanner sc = new Scanner(System.in)){
		
		while(!selectedWork.isComplete()) {
			System.out.println("Word : ");
			selectedWork.dw.forEach(System.out::print);
			System.out.println(" >> ");
			String input = sc.next();
			if(input.length() != 1||!Character.isLowerCase(input.charAt(0))) {
				System.out.println("한글자의 영 소문자만 입력 가능합니다.");
				continue;
			}
			char guess = input.charAt(0);
			if(!selectedWork.guessed.add(guess)) {
				System.out.println(guess+"(은)는 이미 입력한 문자입니다.");
				continue;
			}
			selectedWork.attempts++;
			if(selectedWork.word.indexOf(guess)==-1) {
				System.out.println(guess+"이(가) 포함되어 있지 않습니다.");
			}else {
				selectedWork.updateDisplay(guess);
			}
		}
		
		System.out.println(selectedWork.word + "정답\n"+selectedWork.attempts + "회만에 정답!" );
	} 
	}
	
}

