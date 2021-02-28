package tekrar01;

import java.util.Scanner;

public class MethodSaatSaniyeKilometreCevirme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*saat ti  saniyeye , mil km ye  klogram mi gram a  ceviren method yazin
		 * Bu methodlari  main methon dun disinda  olusturn ve  cagirin
		 */
		Scanner  scan= new Scanner(System.in);
		System.out.println("Birim ve mikrarini giriniz ");
		
		String  birim=scan.nextLine();
		double miktar=scan.nextDouble();
		
		
		
//	}

	//public static double cevirici(String birim,double miktar) {
	//	switch (birim) {
		//case saniye:
			
	//	}
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) 
			{
				System.out.println("*");
			}
			System.out.println();
		}
		
	
	}
}
