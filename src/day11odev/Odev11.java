package day11odev;

import java.util.Scanner;

public class Odev11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Cat, caterpillar";
		
		
		System.out.println(str.substring(0));
		
		System.out.println(str.substring(3));
		
		System.out.println(str.substring(15));
		
		System.out.println(str.substring(5,8));
		System.out.println(str.substring(5,5));
		//System.out.println(str.substring(8,5));  hata exception verir cunku  mantiksiz bir islem istendi 
		
		System.out.println(str.startsWith("C"));
		
		System.out.println(str.startsWith("c"));
		
		System.out.println(str.startsWith("B"));
		
		System.out.println(str.startsWith("Cat"));
		
		System.out.println(str.startsWith("c",5));
		
		System.out.println(str.startsWith("ter",7));
		
		System.out.println(str.startsWith(""));
		System.out.println(str.startsWith("p",11));
		
		System.out.println(str.endsWith("C"));
		
		System.out.println(str.endsWith("lar"));
		System.out.println(str.endsWith(""));
		System.out.println(str.endsWith("caterpillar"));
		
		System.out.println(str.replace("C","ok"));
		System.out.println(str.replace("a","askim"));
		
		System.out.println(str.replace("","|"));
		
		System.out.println(str.replace("a",""));
		
		System.out.println(str.replace("at","amel"));
		
		System.out.println(str.replaceFirst("C","ok"));
		System.out.println(str.replaceFirst("at","gelecek"));
		
		String str1="500";
		String str2="850";
		
		int str3=500;
		int str4=850;
		
		
		System.out.println(String.valueOf(str1)+String.valueOf(str2)); // concanetation  yapiyor 
		
		
		System.out.println(Integer.valueOf(str3)+Integer.valueOf(str4));// Wrapper da ki  inter ile toplama yapilir 
		
		
		System.out.println("Bir tamsayi giriniz lutfen ");
		
		//1 den 50  ye  kadar  olan tam sayilari ekrana yazdirin
	
		
		for (int i=1; i<51; i++) {
			System.out.print(i+"|");
			
			}
		
		
		
		System.out.println("cift tamsayilari ekrana yazdiriniz ");
		
		// 1 den 87 e kadar  olan butun cift tamsayilari ekrana yazdirin
		
		for ( int i=2; i<87; i+=2) {
			
			System.out.print(i+"|*");
		}
		
		// 1 den  135  e kadar olan butun 3 ile bolunebilen tamsayilari ekrana yazdirin
		
		System.out.println();
		
		for ( int i=3; i<135; i+=3 ) {
			
			System.out.print(i+"^-^");
			
			
		}
		
		
		
		
	}

}
