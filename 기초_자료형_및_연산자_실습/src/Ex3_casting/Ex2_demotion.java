package Ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
	//2.demotion casting
		// - 작은 자료형에 큰 자료형이 대입되는 것
		char c = 'A';//2byte
        int n = c +2;//4byte
        //char의 알파벳을 아스키코드로 변환 뒤 술식에 맞게 정수 계산이 된다.
        c = (char)n;//-> 아스키코드로 인식하게된다.
        //자료가 손실되는 값을 감안하고 대입할 수 있게 하는것
        System.out.println(c);
		
        float f = 5.5f;
        int i = 0;
        i = (int)f;
        System.out.println(i);
	}//main

}
