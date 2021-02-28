package replIt;

import java.util.Scanner;

public class HarfCagirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner sc=new Scanner(System.in);
	    System.out.println("Metin giriniz");
	 
	    sesliHarf();
	  }
	  
	  public static void sesliHarf(){
		  Scanner sc=new Scanner(System.in);
		  //System.out.println("Metin giriniz");
		    
		  
		String kelime=sc.nextLine();
	   
		String seslier="aeoui";
	    
	    int sayac=0;
	    
	    for (int i=0; i<=kelime.length()-1; i++ ){
	       for (int j=0; j<=4; j++){
	         if(kelime.charAt(i)==seslier.charAt(j)){
	           sayac++;
	         }
	       }
	      
	    }
	    System.out.println("Stringdeki sesli harf sayisi :"+sayac);
	    
	   
	  }

	}


