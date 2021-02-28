package sametBeyleJava;

public class Warmup_1_stringE {

	/*Return true if the given string contains between 1 and 3 'e' chars.
		stringE("Hello") → true
		stringE("Heelle") → true
		stringE("Heelele") → false
			 * 
	 */
	public static  void main(String[] args) {
		
		System.out.println(stringE("Hello Helen"));
		System.out.println(stringB("mehrhabe"));
		
	}
	
	public static boolean stringE(String str) {
		
		int count=0;		
		for (int i=0; i<str.length(); i++) {	
			if (str.charAt(i)=='e' ) {
				count++;
			}					
		}
	   return (count>=1 && count<=3);
	
	}
	
	public static boolean stringB(String str) {
		
		int j=0;
		
		boolean result=false;
		
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)=='e') {
				j++;
			} 
			if ((j==1) || (j==3)) {
				result=true;
			}else {
				result=false;
			}
		}
		
		return result;
	}
	
	public boolean in3050(int a, int b) {
		  /*
Given 2 int values, return true if they are both in the range 30..40 inclusive,
 or they are both in the range 40..50 inclusive.
in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
		   *
		   */
		boolean result=false;
		
		if ( (a>=30) && (a<=40) && (b>=30) && (b<=40) || (a>=40) && (a<=50) && (b>=40) && (b<=50)    ) {
			
			result=true;
		}else {
			result=false;
		}
		
		return result;
		
	}

	
}
