package Ex3_collections;

import java.util.HashMap;
import java.util.Scanner;

public class Ex5_Map {
public static void main(String[] args) {
	
	//id : aaa
	//pw: 1111
	//아이디가 존재 하지 않습니다
	//id : lee
	//pw : 3333
	//비밀 번호가 일치하지 않습니다
	//id : kim
	//pw : 1111
	//로그인 성공
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	map.put("kim", 1111);
	map.put("lee", 2222);
	map.put("park", 3333);
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("id :");
	String id = s.next();
	System.out.println("pw : ");
	int pw = s.nextInt();
	
	if(!map.containsKey(id)) {
		System.out.println("아이디가 존재하지 않습니다.");
	}else{
		if(map.get(id) == pw) {
			System.out.println("로그인 성공");
		}else {System.out.println("비밀번호 불일치");}
	}
	
	
	
	
	
	
}//main
}
