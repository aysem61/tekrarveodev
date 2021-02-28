package udemyProje;

import java.util.Scanner;

public class If_Else_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if(condition){
		 * 
		 *  kosul  saglaninca  burasi calisir
		 * 
		 * }else{
		 * 
		 *   yukarida ki kosul  saglanmazsa  burasi calisir
		 * 
		 * }
		 * 
		 * 
		 */

		Scanner s=new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=s.nextInt();
		
		if(yas<18) {
			System.out.println("Giris izniniz yok ");
		}else {
			System.out.println(" Hos geldiniz");
		}
		
		
		System.out.println(" islem icin rakam giriniz ");
		
		int act=s.nextInt();
		
		if(act>=90) {
			System.out.println("birinci islem AA");
		}else if (act>=85) {
			
			System.out.println("ikinci islem BB");
		}else if(act>=80) {
			
			System.out.println("ucuncu islem  CC ");
		}else {
			System.out.println("sonuncu islem ve cikis");
		}
		
	}

}
