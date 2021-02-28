package replIt;

public class KartNumarasiSon4Rakami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kredi kartı numarası alan ve yalnızca son dört karakteri görüntüleyen bir method yazın. 
		//Kart numarasının geri kalanı ************ ile değiştirilmelidir.
		
		System.out.println(cardHide("1234123456785678"));
	}

	public static String cardHide(String c) {
		
		 String firstDigit=c.substring(0,12);
		    
		 String degis=firstDigit.replaceAll(firstDigit,"************");
		    
		 String lastDigit =c.substring(c.length()-4);
		 return degis+lastDigit;
		
		
	}
}
