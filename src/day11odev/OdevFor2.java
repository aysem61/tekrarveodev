package day11odev;

import java.util.Scanner;

public class OdevFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Kullanicdan baslagic ve bitis degerlerini alin ve baslangic  degerinden veya  sonrasindan  baslayip bitis degerinde  veya  oncesinde  biten  tum 3 ile bolunebilen  tamsayilari  yazin
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("baslangic tamsayi");
		int num1=scan.nextInt();
		System.out.println("bitis tamsayi");
		int num2=scan.nextInt();
		
		
		if (num1<num2) {
			
			for (int i=num1; i<(num2+1); i++ ) 
			
			if (i%3==0){
				System.out.print(i);
			}
		}else {
			for (int i=num1; i>(num2-1); i--) 
			
			if (i%3==0)  {
				System.out.print(i);
			}
		}
		
		
		
	}

}
