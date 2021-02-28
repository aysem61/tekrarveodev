package tekrar01;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,5,3,2};
		

		System.out.println(Arrays.toString(fizzArray(5)));
		
		System.out.println(canBalance(arr));
	}
	
	
	public static  int[] makeLast(int[] nums) {
		 
		int arr[]=new int[2*nums.length];
		  arr[arr.length-1]=nums[nums.length-1];
		  return arr;
		  
	}
	

	public static int[] fizzArray(int n) {
	/*Given a number n, create and return a new int array of length n, 
	 * containing the numbers 0, 1, 2, ... n-1. 
	 * The given n may be 0, in which case just return a length 0 array.
	 *  You do not need a separate if-statement for the length-0 case;
	 *   the for-loop should naturally execute 0 times in that case, so it just works.
	 *    The syntax to make a new int array is: new int[desired_length] 
	 *      (See also: FizzBuzz Code)
	 * 	  
	 */
		
		
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i]=i;
		}
		
		return arr;
		
	}
	
	public static  boolean canBalance(int[] nums) {
		  
		  int ilk=0;
		  
		  int son=0;
		  
		  for( int i=0; i<nums.length; i++){
		    
		    son+=nums[i];
		 
		 }
		  
		  
		  for (int i=0; i<nums.length-1; i++){
		    
		    ilk+=nums[i];
		    
		    son-=nums[i];
		    
		    
		    if(ilk==son)
		      
		    return true;
		    
		   
		    
		  }
		  
		  
		  return false;
		}
	
	public static  int sum2(int[] nums) {
		/*Given an array of ints, return the sum of the first 2 elements in the array. 
		 * If the array length is less than 2, 
		 * just sum up the elements that exist, returning 0 if the array is length 0.
		 * 
		 */
		int sum=0;
		  
		if ( nums.length>=2) {
			
		
			sum+=nums[0]+nums[1];
		}else if (nums.length<2) {
			for(int i=0; i<nums.length; i++ ) {
				
				sum+=nums[i];
			}
		}
		
		return sum;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
