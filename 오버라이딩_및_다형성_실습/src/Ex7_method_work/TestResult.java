package Ex7_method_work;

public class TestResult {
public void PrintRes(String q){
//연산 및 최종결과
	int a=0;
	int b=0;
	for(int i=0; i<q.length(); i++) {
		if(q.charAt(i)=='O') {
			a++;
		}else {a=0;}
			b+=a;
	}
	
	System.out.println("결과 : " + b);
	
	
	
}
}
