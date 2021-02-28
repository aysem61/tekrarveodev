package day15MethodCreation;

public class Method3 {

	public static void main(String[] args) {
		//girilen sayinin  tersini return  eden java methodu  yaziniz 
		
	 System.out.println(sayininTersi(234));
		
	}

	public static int sayininTersi(int n) {
		int sonuc=0;
		int n1 = 0;
		
		while (n1>0) {
			int sayi = sonuc%10;
			sonuc/=10;
			sonuc=sonuc*10+sayi;
			
		}
		return sonuc;
	}
}
