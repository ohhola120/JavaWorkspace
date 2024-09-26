package Ex5_class_array;

public class Vending {
	
		
		
		Can[] cans = new Can[5];
		private int money;
		
		//음료수의 종류와 가격을 초기화
		public void init() {
			for(int i=0; i<cans.length;i++) {
				cans[i] = new Can();
			}
		
		
		
		cans[0].setName("coke");
		cans[0].setPrice(1000);
		
		cans[1].setName("sprite");
		cans[1].setPrice(1000);
		
		cans[2].setName("fanta");
		cans[2].setPrice(1100);
		
		cans[3].setName("mountain Dew");
		cans[3].setPrice(1200);
		
		cans[4].setName("Dr.pepper");
		cans[4].setPrice(1100);
		
		
		
	
}
		//들어온 금액으로 마실수 있는 음료의 목록 출력
				
		public void showCans(int m) {
			money = m;
			
			for(int i=0; i<cans.length; i++) {
				if(cans[i].getPrice() <= money) {
					System.out.printf("%s - %d\n",
							cans[i].getName(),cans[i].getPrice());
				}
			}
		}
		
		//음료를 선택하고 잔액을 계산하는 메서드
		public void selsctCan(String name) {
			for(int i=0; i<cans.length; i++) {
				if(cans[i].getName().equalsIgnoreCase(name)) {
					System.out.println(name + "을 선택함");
					System.out.println(money - cans[i].getPrice()+"원");
				}
			}
		}
		
}
