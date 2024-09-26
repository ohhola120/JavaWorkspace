package Ex6_method_calculator;

public class CalPrint {

	public void pirntresult(int a, int b, String c) {

//		if(c = '+') {
//			int d = a+b;
//			System.out.printf("%d %s %d = %d",a,b,c,d);
//			return;
//		}else if(c='-') {
//			int d = a-b;
//			System.out.printf("%d %s %d = %d",a,b,c,d);
//			return;
//		}else if(c='*') {
//			int d = a*b;
//			System.out.printf("%d %s %d = %d",a,b,c,d);
//			return;
//		}else if(c='/') {
//			int d = a/b;
//			System.out.printf("%d %s %d = %d",a,b,c,d);
//			return;
//		}

		switch (c) {
		case "+":
			int d = a + b;
			System.out.printf("%d %s %d = %d", a, c, b, d);
			break;
		case "-":
			d = a - b;
			System.out.printf("%d %s %d = %d", a, c, b, d);
			break;

		case "*":
			d = a * b;
			System.out.printf("%d %s %d = %d", a, c, b, d);
			break;
		case "/":
			 d = a / b;
			System.out.printf("%d %s %d = %d", a, c, b, d);
			break;
			
			default:
			System.out.println("올바른 연산자를 입력하세요");
			break;
		}

	}

}
