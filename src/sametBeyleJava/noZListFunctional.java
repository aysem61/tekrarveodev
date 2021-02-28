package sametBeyleJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class noZListFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Givenz list of strings retzurn a lizst of the strings omitzting any string that contains methodz returns a boolean)";
		
		String kelimeler[]=word.split(" ");
		
		List<String> kelimeList=Arrays.asList(kelimeler);
		
		System.out.println(kelimeList);
		
		System.out.println(noZ(kelimeList));
		System.out.println(" not 34 ");
		
		System.out.println(no34(kelimeList));
		
		String y[]= {"a","b","c","y","yy"};
		List<String> yList=Arrays.asList(y);
		
		System.out.println(yList);
		
		System.out.println(noYY(yList));
		
	    Integer[] num = new Integer[] {2,4,5,6,7,11};
		List<Integer> numList=Arrays.asList(num);
		
		System.out.println(square56(numList));
		
		

	}
	
	public static  List<String> noZ(List<String> strings) {
 //Given a list of strings, return a list of the strings, 
//omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
//noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
//noZ(["hziz", "hzello", "hi"]) → ["hi"]
//noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
		
		List<String> yeni=new ArrayList<>();
		
		for(String  s:strings) {
			
			if(!s.contains("z"))
		   yeni.add(s);
			
		}
		
		
		return yeni;
		
		
	}

	public static List<String> no34(List<String> strings) {
		  /*
		   * Given a list of strings, return a list of the strings, 
		   * omitting any string length 3 or 4.
				
				no34(["a", "bb", "ccc"]) → ["a", "bb"]
				no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
				no34(["ccc", "dddd", "apple"]) → ["apple"]
		   */
		List<String> yeni=new ArrayList<>();
		
		for(String s:strings) {
			
			if(s.length()<3 || s.length()>4) {
				
				yeni.add(s);
			}
		}
		
		return yeni;
		
	}

	public static List<String> noYY(List<String> strings) {
		//Given a list of strings, return a list where each string has "y" added at its end,
		//omitting any resulting strings that contain "yy" as a substring anywhere.
		
		List<String> yeni=new ArrayList<>();
		
		for(String w:strings) {
			 
			w=w+"y";
			if(!w.contains("yy"))
			yeni.add(w);
			
		}
		
		return yeni;
	}

	public  static List<Integer> two2(List<Integer> nums) {
		//Given a list of non-negative integers, return a list of those numbers multiplied by 2,
		//omitting any of the resulting numbers that end in 2.
			
			/*p
			two2([1, 2, 3]) → [4, 6]
			two2([2, 6, 11]) → [4]
			two2([0]) → [0]
			*/
		
		List<Integer>  yeni=new ArrayList<>();
		
		for(int num:nums) {
			
			int result=num*2;
			
			if(!(result%10==2)) {
				
				yeni.add(result);
			}
			
		}
					
		  return yeni;
	}
	
	
	public static List<Integer> square56(List<Integer> nums) {
		
	//Given a list of integers, return a list of those numbers squared 
	//and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.	
		
	/*
	 *  square56([3, 1, 4]) → [19, 11]
		square56([1]) → [11]
		square56([2]) → [14]	
	 */
		
		List<Integer> yeni=new ArrayList<>();
		
		for( int n:nums) {
			
			n=(n*n)+10;
			
			if(!( n%10==5) && !(n%10==6)) {
				
				yeni.add(n);
			}
			
		}
		
		
		return yeni;
		
		  
	}


	

}
