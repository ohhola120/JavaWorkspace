package Ex5_method_gugudan;

public class PrintGugu {

	public void print(int n) {
		
		for(int i=1; i<=9; i++) {
			int b = n*i;
			
			System.out.printf("%d X %d = %d\n",n,i,b);
		}
	}
}
