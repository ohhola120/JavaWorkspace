package Ex1_single_array;

public class Ex5_array {
public static void main(String[] args) {
	
	//배열 arr에 담긴 값 중 가장 큰 값을 출력
	//-------------------
	//가장 큰 값 : 19
	
	int[] arr = {4,13,7,19,1,15};
	
	/*
	int b = 0;
	for(int i=0; i< arr.length; i++) {
		if(arr[i]>b) {
			 b= arr[i];
	}
		
	}System.out.println("가장 큰 값 :" + b);
	*/
	
	int m = arr[0];
	for(int i=1; i<arr.length; i++) {
		if(arr[i] > m) {
			m = arr[i];
		}
	}//for
	System.out.println("가장 큰 값 :" + m);
	
	
	
	
}//main
}
