package multidimensional3;

public class MultidimensionalOdev {

	public static void main(String[] args) {
		/*
		 *1) Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını ekrana yazdıran bir program yazınız.  { {1,2,3}, {4,5,6} }  
		 */
		
		
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		int count=1;
		
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				
				count=count*arr1[i][j];
				
			}
		}System.out.println(count+"carpim sonucu");
		
		// 2) Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana yazdıran
		//bir program yazınız { {1,2,3}, {4,5}, {6} } 
		
		int arr2[][]= { {1,2,3}, {4,5}, {6} };
		
		int sonuc=arr2[0][2]*arr2[1][1]*arr2[2][0];
		
		System.out.println(sonuc);
		
		int product=1;
		
		
		for (int i=0; i<arr2.length; i++) {
			product=product*arr2[i][arr2[i].length-1];
			
			
			System.out.println(product+"son elemanlarin carpimi  ");
			
		}
		
	}
}
