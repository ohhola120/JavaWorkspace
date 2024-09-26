package Ex8_method;

public class Palindrome {
public String rotate(String a){
	//원본 문자열을 뒤집어서 저장
	
	String rev_a = "";
	for(int i=a.length()-1; i>=0; i--) {
		rev_a+=a.charAt(i);

	}
	return rev_a;
	
	
	
}
}
