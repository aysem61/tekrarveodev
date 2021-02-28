package day11odev;

import java.util.Scanner;

public class WhileLoopodev1 {

	public static void main(String[] args) {
		// whileloop kullanarak 1 den 10 kadar olan tamsayilari ekrana  yazdirin
		
		
		int num=1;
		
		while(num<11) {
			
			System.out.print(num+":");
			
			num++;
		}

		// 1  den 20 e  kadar  olan cift tamsayilari ekrana yazdirin
		System.out.println();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz ");
		int num1=scan.nextInt();
		
		while (num1<21) {
			
			if (num1%2==0) {
				
				System.out.println(num1+" ");
					
			}
			
			num1++;
		}
		
		System.out.println();
		
		// while loop kullanarak 5 den 120 kadar  3 ile bolunebilen tamsayilari ekrana yazdiralim
		
		int num2=5;
		
		while ( num2<=120 ) {
			
			if (num2%3==0) {
				System.out.print(num2+" ");
			}
			num2++;
		}
		
		
		
		
		
	}

}
