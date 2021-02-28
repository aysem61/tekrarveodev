package udemyProje;

import java.util.Scanner;

public class Projeler {

	static Scanner s=new Scanner(System.in); 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		en_buyuk_yas();
	}

	private static void en_buyuk_yas() {
		
		System.out.println("Birinci sayiyi giriniz: ");
		
		int a=s.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz: ");
		
		int b=s.nextInt();
		
		System.out.println("Ucuncu sayiyi giriniz: ");
		
		int c=s.nextInt();
		
		int max=-1;
		
		if(a>=b && a>=c) {
			
			max=a;
			
			System.out.println(max+ " a dir ");
		}else if (b>=a && b>=c) {
			max=b;
			
			System.out.println(max+ " b dir ");
		}else {
			max=c;
			
			System.out.println(max+" c dir ");
			
			
			
					
		}
		
		
	}
	

}
