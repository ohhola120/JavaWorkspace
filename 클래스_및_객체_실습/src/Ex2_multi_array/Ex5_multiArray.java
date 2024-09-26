package Ex2_multi_array;

public class Ex5_multiArray {
public static void main(String[] args) {
	//2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 출력
	//------------------------
	//총 합: 150
	//평균 : 12.5
	int[][] arr= {
			{5,17,2,1},
			{11,6},
			{9,15,20},
			{13,21,30,} };
	float c=0;//평균을 위한 변수
	int a=0;//총 합을 위한 변수
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			a+=arr[i][j];
			c++;
			
		}//in
	}//out
	System.out.println("총 합 : "+a);
	float b = a / c;
	System.out.println("평균 : "+b);
 
	
	
	
}//main
}
