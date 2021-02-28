package tekrar01;

import java.util.Scanner;

public class AsalSayiKontrolu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Kullanicidan  alinanan bir sayi asal ise "true" degilse "false"
		// donduren bir method  yaziniz
		
		// int alip boolean  dondurecegiz 
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		System.out.println(isPrime(sayi));
	}
	public static boolean isPrime(int num) {
		boolean kontrol=false;
		int   asalDeneme=2;
		
		while(num>1) {
			if (num%asalDeneme==0) {
				// num= asalDeneme ===> Asay sayiyi bu noktada  yakaladim
				//num%asalDeneme    ==> num asal degil 
				if(num==asalDeneme) {
					kontrol=true;
					break;
				}else {
					kontrol=false;
					break;
				}
				
				
			}
			
			asalDeneme++;
		}
		
		return kontrol;
	}

}
