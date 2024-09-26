package Ex3_Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Work {

	String word;
	List<Character> dw;
	Set<Character> guessed = new HashSet<>();
	int attempts = 0;
	
	public  Work(String word) {
		this.word = word;
		this.dw = new ArrayList<>(Collections.nCopies(word.length(), '*'));
	}
	public boolean isComplete() {
		return dw.equals(Arrays.asList(word.chars().mapToObj(c -> (char) c).toArray(Character[]::new)));
		
	}
	
	public void updateDisplay(char guess) {
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)==guess) dw.set(i,guess);
		}
	}
}
