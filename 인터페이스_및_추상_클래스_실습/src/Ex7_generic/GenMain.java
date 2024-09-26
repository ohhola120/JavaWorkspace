package Ex7_generic;

import Ex6_generic.Gen;

public class GenMain {
public static void main(String[] args) {
	
	
	Integer[] iArr = {1,2,3,4,5};
	Double[] dArr = {1.1,2.1,3.1,4.1,5.1};
	
	GenTest gt = new GenTest();
	gt.printArr(iArr);
	gt.printArr(dArr);
	
	
	Gen<Integer> gen = new Gen<Integer>();
	for(int i=0; i<iArr.length; i++) {
	gen.setValue(iArr[i]);
	System.out.print(iArr[i]+" ");
	}
	System.out.println();
	System.out.println("-------------------");
	Gen<Double> gen2 = new Gen<Double>();
	for(int i=0;i<dArr.length;i++) {
		gen2.setValue(dArr[i]);
		System.out.print(dArr[i]+" ");
	}
	
}//main
}
