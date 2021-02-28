package sametBeyleJava;

import java.util.Arrays;

public class rotateLeft3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,3};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(makeEnds(arr));
		

	}
	
	public static  int[] rotateLeft3(int[] nums) {
		
		int yeni[]=new int[3];
		for(int i=0; i<nums.length-1;i++) {
			
			yeni[i]=nums[i+1];
		}
		
		yeni[0]=nums[nums.length-1];
	   return yeni;
	}
	
	public static  int[] middleWay(int[] a, int[] b) {
	/*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
	 * 	
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	 */
		
		int result[]=new int[2];
		
		result[0]=a[1];
		result[1]=b[1];
		
		return result;
		
		  
	}
	
	public static int[] makeEnds(int[] nums) {
		/*Given an array of ints,
		 *  return a new array length 2 containing the first and last elements from the original array. 
		 *  The original array will be length 1 or more.
		 *   makeEnds([1, 2, 3]) → [1, 3]
		 */
		
		int result[]=new int[2];
		
		if(nums.length>=1) {
			
			result[0]=nums[0];
			result[1]=nums[nums.length-1];
		}
		
		return result;
	}
	
	public static int  countEvents(int[] nums) {
		/*Return the number of even ints in the given array.
		 *  Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

         countEvens([2, 1, 2, 3, 4]) → 3
		 * 
		 */
		int count=0;
	for(int i=0; i<nums.length;i++) {
		
		if(nums[i]%2==0) {
			count++;
		}
	}
		
		return count;
	}
	
	public static  boolean more14(int[] nums) {
		
		/*Given an array of ints, 
		 * return true if the number of 1's is greater than the number of 4's
		 * 
		 */
		boolean result=false;
		
		int count=0;
		int artis=0;
		
		for(int w:nums) {
			
			if(w==1 ||w==4) {
				
				if(w==1) {
					count++;
				}else if (w==4){
					artis++;
				}
				
				
			}
			
			if(count>artis) {
				result=true;
			}
		}
		  
		return result;
	}

}
