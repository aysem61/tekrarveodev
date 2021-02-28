package day15MethodCreation;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		/*
		 * Kullanicidan sayi girmesini  soyleyin .Kullanici  sifir girdiginde   
		 * ekrana  o ana kadar girmis  oldugu  
		 * t[m sayilarin toplamini   yazdiriniz
		 * ogrnegin 5, 4, 7 , ise  5+4+7+=16 ekrana 16 yazdirin
		 * 
		 * 
		 */
    
      

      
      Scanner scan=new Scanner(System.in);
        
       int num=0;
       int sum=0;
       
       
      do {
    	  System.out.println("sayi giriniz ");
    	  
		  num=scan.nextInt();
    	  
		  
		  sum=sum+num;// o ana kadar girilen sayilarin tolam formulu   sum+num  seklin de herdefasinda  sum artiyor 
    	  
    	  
    	  
    	  
      }while(num!=0);
      
      
      System.out.println(sum+" "+"simdiye kadar girilen rakamlarin toplami");

	}

}
