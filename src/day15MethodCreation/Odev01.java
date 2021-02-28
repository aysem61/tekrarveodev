package day15MethodCreation;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		/*
		 * Saati  saniye ye  ,ml'i  kilometrye  ceviren bir program 
		 * 
		 * kilogrami  grama ceviren bir metho  yaziniz
		 * 
		 * BU method u main methodun  disinda  olusturup  main methodun icinden cagiriniz
		 * 
		 * 
		 * 
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Birim  giriniz");
		String birim=scan.next();
		
		System.out.println("Miktar giriniz");
		
		double miktar=scan.nextDouble();
		
		cevirici(birim,miktar);
		
		scan.close();
		
	}
      public static void cevirici(String birim,double miktar) {
    	  
    	  switch (birim){
    	  
    	  case "saat":
    		  System.out.println(miktar*60*60);
    	  break ;
    	  case "mil":
    		  System.out.println(miktar*1.6);
    	  break ;
    	  case "kilogram":
    		  System.out.println(miktar*1000);
    	  break ;
    	  default:
    		  System.out.println("Hatali giris yaptiniz  , tekrar giriniz ");
    	  }
    	  
    	  
      }
	
     
    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	
}
