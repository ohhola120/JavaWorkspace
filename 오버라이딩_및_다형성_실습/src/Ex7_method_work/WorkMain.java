package Ex7_method_work;

public class WorkMain {
public static void main(String[] args) {
	
	//qustion이 OOXXO라면 1+2+0+0+1의 결과인 4
	//OXXOOXOOO -> 1+0+0+1+2+0+1+2+3 =10
	//OOXXOXXOOOO ->1+2+0+0+1+0+0+1+2+3+4 =12
	String qustion ="OOXXOXXOOOO";
	
	TestResult tr = new TestResult();
	tr.PrintRes(qustion); 
	
}//main
}
