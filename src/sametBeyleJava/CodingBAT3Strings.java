package sametBeyleJava;

public class CodingBAT3Strings {

	public static void main(String[] args) {
		
		
		
	}
	
	public static String middleTwo(String str) {
		
		 /*Given a string of even length, 
		 * return a string made of the middle two chars, 
		 * so the string "string" yields "ri". 
		 * The string length will be at least 2.

			middleTwo("string") → "ri"
			middleTwo("code") → "od"
			middleTwo("Practice") → "ct"
		 *
		 */
		String yeni="";
		
		if(str.length()>=2) {
			
			for (int i=0; i<str.length();i++) {
				
			int half=str.length()/2;
			
			if (i==half) {
				
			 yeni= str.substring(half,half+2);
			}
			
			}
				
		}
		
		return yeni;
	}

	
	public static int[] fix23(int[] nums) {
		
		/*Given an int array length 3, if there is a 2 in the array 
		 * immediately followed by a 3, set the 3 element to 0.
		 *  Return the changed array.

			
			fix23([1, 2, 3]) → [1, 2, 0]
			fix23([2, 3, 5]) → [2, 0, 5]
			fix23([1, 2, 1]) → [1, 2, 1]
					 * 
		 */
		
		int yeni[]=new int[3];
		
		for(int i=0; i<nums.length;i++) {
			
			if(nums[i]==2 && nums[i+1]==3) {
				
				nums[i+1]=0;
				
				yeni=nums;
			 
		
			}else {
				return nums;
			}
			
		}
		return yeni;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
