package tekrar01;

import java.util.Scanner;

public class DoWhileOyunSorusu1 {

	public static void main(String[] args) {
		/*
		 * Kullaniciya  sayi girmesini  soyleyiniz  
		 * Kullanici  0 girdiginde  , o ana kadar girmis olduugu  tum sayilarin toplamini ekrana yazdirin
		 * ornegin : 5,6,3,6, toplamlari gibi  
		 */

		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		int  sum=0;
		
		do {
			System.out.println("Bir sayi giriniz");
			   num=scan.nextInt();
			sum=sum+num;
					
		}while(num!=0);
		
		System.out.println("girilen sayilarin toplami :"+sum);
		scan.close();
	}

}
