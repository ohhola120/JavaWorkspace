package Ex2_Overloading;

public class Bread {
//1	
public void makeBread() {
	System.out.println("빵을 만들었습니다.");
}
//2
public void makeBread(int a) {
	
	for(int i=0; i<a; i++) {
		System.out.println("빵을 만들었습니다");
		
	}System.out.println(a+"개의 빵을 만들었습니다");
}
//3
public void makeBread(String a,int b) {
	
	
	for(int i=0; i<b; i++) {
		System.out.printf("%s을 만들었습니다\n",a);
		
	}System.out.printf(b+"개의 "+ a+"을 만들었습니다");
	
}

}
