package tekrar01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsalSayiListeleme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//verilen sayiya kadar olan butun sayilarin listesi olusturun
		System.out.println("bir limit degeri giriniz");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();// bu sayiya kadar  kontrol edileceke 
		
		List<Integer> list=new ArrayList<>();// kontrol ettigim  sayilari icine  atabilecegim list olusturudum
		
		//list.add(2);
		
		for(int i=2; i<=sayi; i++) {
			
			if(AsalSayiKontrolu.isPrime(i)) {
				list.add(i);
			}
		}
		
	}

}
