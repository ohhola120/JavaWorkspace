package Ex2_multi_array;

public class Ex7_multiArray {
public static void main(String[] args) {
	
	int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
	//2차원 배열 array에서 3의 배수를 베외한 값들만을 출력
	
	
	for(int i=0; i<array.length; i++) {
		for(int j=0; j<array[i].length;j++) {
			if(array[i][j]%3!=0) {
				System.out.print(array[i][j]+" ");
			}
		}
		
	}
	
	
	
}//main
}
