package day15MethodCreation;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// iki sayinin  esitklik durumunu  kontrol eden metod yaziniz
		
		System.out.println(esitMi(5,5));
		
	}
	
    public static boolean esitMi(int num1,int num2) {
    	
    	if (num1==num2) {
    		return true;
    	}
    	return false ;
    }

    
}
