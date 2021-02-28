package sametBeyleJava;

public class CodingBat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		System.out.println(last2("hixxihihi"));

		System.out.println(doubleX("axxbb"));
	}
	
	public static int last2(String str) {
		
		
		int count=0;
		
		for(int i=0; i<str.length()-2; i++) {
			
			if(str.substring(i, i+2).contains(str.substring(str.length()-2))) {
				count++;
			}
			
		}


		return count;
	}
	
	static boolean doubleX(String str1) {
		/*
		 * Given a string, return true if the first instance of "x" in the string is immediately 
		 * followed by another "x".

			doubleX("axxbb") → true
			doubleX("axaxax") → false
			doubleX("xxxxx") → true
		 */
//		boolean is=false;
//		
//		for(int i=0; i<str.length()-1;i++) {
//			
//			if(str.charAt(i)==str.charAt(i+1)) {
//				is=true;
//			}
//			
//		}
        String str="axxbb";
		
		int i=str.indexOf('x');
		if (i==-1)
			return false;
		if(i+1>=str.length())
			return false;
		
		
		System.out.println(i);
		
		return str.substring(i+1, i+2).equals("x");
		
		  
	}



}
