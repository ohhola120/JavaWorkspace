package Ex5_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		/*
		 * 
		 * 사용자가 현재 가지고 있는 돈을 입력받고, 크림빵, 새우깡, 콜라를 잔돈을 하나도 남기지 않고 구입하는 경우의 수를 모두 출력하시오 단,
		 * 구입하지 않은 상품이 있으면 안된다 --크림빵 500, 새우깡 700, 콜라 400, -----------------------------
		 * 소지금 4000 크림빵 1 새우깡 1 콜라 7 크림빵 2 새우깡 2 콜라 4 크림빵 4 새우깡 3 콜라 1 크림빵 5 새우깡 1 콜라 1
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("소지금 : ");
		int cash = sc.nextInt();

		int a = 500;// 크림빵
		int b = 700;// 새우깡
		int c = 400;// 콜라
		
/*
		while(true) {
			while(true) {
				int q = x * a;
				if (q > cash) {
					break;
				}
					
			}
			while(true) {
				int w = y * b;
				if( q + w > cash) {
			}break;
			
			}
			while(true) {
				int e = z * c;
				if( q + w + e > cash) {
					break;
				}
				 if ( q + w + e == cash) {
                     System.out.println("크림빵: " + x + ", 새우깡: " + y + ", 콜라: " + z);
                 }
	          
			}
		}
*/
		int x = 1;
        while (true) {
            int q = a * x;
            if (q > cash) {
                break;
            }

            int y = 1;
            while (true) {
                int w = b * y;
                if (w + q > cash) {
                    break;
                }

                int z = 1;
                while (true) {
                    int e = c * z;
                    if (e + w + q > cash) {
                        break;
                    }

                    if (q + w + e == cash) {
                        System.out.println("크: " + x + ", 새: " + y + ", 콜: " + z);
                    }
                    z++;
                }
                y++;
            }
            x++;
        }

		
		
		
	}// main

}
