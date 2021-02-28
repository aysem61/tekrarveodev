package day11odev;

import java.util.Scanner;

public class Odev4Toplamfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan baslangic  ve bitis  degerlerini  alin ve baslangic degerinden baslayip bitis  degerinde biten
		//tum sayilarin  toplamini ekrana  yazdirin .
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir baslangis ve  bitis degeri giriniz ");
		
		
		int num1= scan.nextInt();
		
		int num2=scan.nextInt();
		
		int sum=0;
		
	   if (num1<num2) {
		   
		   for (int i=num1; i<(num2+1); i++) {
			   sum=sum+i;
		   }System.out.println(sum);
	   }else {
		   for (int i=num1; i>(num2-1); i--) {
			   sum=sum+i;
		   }System.out.println(sum);
	   }
		
		System.out.println("yeni islem carpa ");
	   
	   // Kullanicidan  baslagic ve bitis degerlerini alin ve  baslagic  degerinden baslayip  bitis degerinde  biten tum sayilarin carpimini  ekrana yazdirin 
		
		int product=1;
		
		if (num1<num2) {
			for (int i=num1; i<(num2); i++) {
				product=product*i;
			}System.out.println(product);
			
		}else {
			for (int i=num1; i>(num2);  i-- ) {
				product=product*i;
			}System.out.println(product);
		}
			
			
		
		
		
	}

}
