package ex1_printf;

public class Ex1_printf {public static void main(String[] args) {
	
	int age = 30;
	
	System.out.printf("제 나이는 %d살 입니다.\n", age);
	//printf는 엔터가 없다 그렇기 때문에 입력값 ""안에 \n을 넣는다 \n->강제 엔터
	System.out.printf("회사에서 집까지 %dkm 입니다.\n", 20);
	
	//저는 25세이고, 키가 160입니다.
    System.out.printf("저는 %d세이고, 키가 %d입니다\n", 25, 160);
	
    //2024-08-21
    System.out.printf("%d-%02d-%d\n", 2024, 8, 21);
	// 한자리 일 때 숫자 앞에 0을 붙히고 싶을 때 %d사이에  02를 입력해줘야 한다(뒤 2는 2자리 숫자로 만든다는 의미 이다)
    
    char last_name = '박';
    //저의 성은 김씨 입니다
    System.out.printf("저의 성은 %c씨 입니다\n", last_name);
    
    //저는 a형이고, 키는 170.5입니다.
    
    System.out.printf("저는 %c형이고 , 키는 %f입니다\n", 'A' ,170.5f );
    
    //오늘 기온은 32.7.도 입니다.
    float temp = 32.7f;
    
    System.out.printf("오늘 기온은 %.1f입니다\n", temp);
    //%f 사이에 .n 값을 넣으면 소수점 자리수 까지 조절가능하다
    
    String region = "서울";
    System.out.printf("제 고향은 %s입니다\n", region);
    
    //저의 나이는 20이고, 사는곳은 경북입니다.
    
    System.out.printf("제나이는 %d이고, 사는 곳은 %s입니다\n", 20 ,"경북");
    
    
    //저는 상위 15%입니다
    
    System.out.printf("저는 상위 %d%%입니다\n", 15);
    
    
    
    //formatter의 종류
    //%d - 정수 
    //%c - 문자 
    //%f - 실수
    //%% - %문자
}//main

}
