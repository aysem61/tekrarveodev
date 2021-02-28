package udemyProje;

import java.util.Scanner;

public class Test1BoyVeKilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boy_kilo();
		
		
		hiz();
		
		deger_degistirme();
		
	    hipotenus();
		

	}
	
	
	private static void hipotenus() {
		// ucgenin dik kenarlari ile hipotenus bulunuz
		
		Scanner s=new Scanner(System.in);
		
		
		int a;
		
		int b;
		System.out.println("ucgenin iki dik kenarini giriniz ");
		a=s.nextInt();
		
		b=s.nextInt();
		
		System.out.println("simdi h yi hesaplayiniz ");
		
		double h=Math.sqrt(a*a+b*b);
		
		System.out.println(" hipotenus "+h);
		
		
		
	}


	private static void deger_degistirme() {
		// TODO Auto-generated method stub
		
	//Kullanicidan aldiginiz iki sayinin degerlerini degistirin 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("lutfen iki deger giriniz");
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("yeni degerler :"+a+" ve "+b);
	
		
		
	}


	public static void boy_kilo() {
		/*
		 * Kullanicidan aldiginiz boy ve kilo degerlerine gore 
		 * 
		 * kullanicinin beden kitle indexini bulun 
		 * 
		 * Beden kitle index= Kilo/boy(m)*Boy(m)
		 */
		
		System.out.println("Boy ve kilonunuzu sirayla giriniz");
		
		Scanner sc=new Scanner(System.in);
		
		
		double boy=sc.nextDouble();
		
		double kilo=sc.nextDouble();
		
		System.out.println("Beden kitle indexiniz : "+(kilo/boy)*boy);
		
		
	}
	
	public static void hiz() {
		
		/*Bir aracin km de ne kadar yaktigini ve kac km yol yaptigini bilgilerini alin ve 
		 * 
		 * sucurunun toplam ne kadar odemesini gerektigini hesaplayiniz
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("arac bilgilerini giriniz ");
		
		double sarf=sc.nextDouble();
		
		double km=sc.nextDouble();
		
		System.out.println("Odemeniz gereken miktar :"+(sarf*km));
		
		
	}

}
