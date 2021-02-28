package day14DoWhileLoopOdev;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		// Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç 
		//değerinden başlayıp bitiş değerinde  biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız
		  
		
		  System.out.println();
		  Scanner scan=new Scanner(System.in);
		  System.out.println("lutfen bir tam sayi giriniz");
		  int ba=scan.nextInt();
		  System.out.println("son sayiyi giriniz");
		  int bi=scan.nextInt();
		  
		  
		  do {
			  if (ba%4==0 && ba%6==0) {
				  
				  System.out.print(ba+" ");
				 }
			  ba++;
		  }while (ba<bi);
	

	}

}
