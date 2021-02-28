package multidimensional3;

public class MultidimensionalArraysOdev03 {

	public static void main(String[] args) {
		/*
		 *  Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını
              ekrana yazdıran bir program yazınız
                 arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
 		 */
		
	int	arr1[][] = { {1,2}, {3,4,5}, {6} };
	
	int arr2[][]= { {7,8,9}, {10,11}, {12} };
	
	
	   int sum=0;
	   
	   
	              for (int i1=0; i1<arr1.length; i1++) {
	            	  
	            	  for(int j1=0; j1< arr1[i1].length; j1++) {
	            		 for (int i2=0; i2<arr2.length; i2++) {
	            			 for( int j2=0; j2<arr2[i2].length; j2++) {
	            				 
	            				 if (i1==i2 && j1==j2) {
	            					 sum=sum+arr1[i1][j1]+arr2[i2][j2];
	            				 }
	            			 }
	            				 
	            				 
	            		 }
	            	  }
	              } System.out.println(sum+"ayni index olanlarin topami ");
		
	    
	}

}
