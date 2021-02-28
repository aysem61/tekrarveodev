package sametBeyleJava;

import java.util.ArrayList;
import java.util.List;

public class listQuetions {

	public static void main(String[] args) {
		
		List<String>  words=new ArrayList<>();
		
		String nolong="Given a list of strings, return a list of the strings, omitting any string length 4 or more";
		
		
		
		
		int j=0;
		
		nolong=nolong+" ";
		
		for(int i=0; i<nolong.length(); i++) {
			
			if( nolong.charAt(i)==' ' ) {
				
				words.add(nolong.substring(j, i));
				
				j=i+1;
				
			}
				
		}
		
		System.out.println(words);
		
		
		System.out.println(noLong(words));
		

	}

	
	public static List<String> noLong(List<String> strings){
	
		//Given a list of strings, return a list of the strings, omitting any string length 4 or more.
		
		List<String> ommiting=new ArrayList<>();
		
		for(int i=0; i<strings.size(); i++ ) {
			
			if(strings.get(i).length()<4) {
				
				ommiting.add(strings.get(i));
			}
			
		}
		
		
		return ommiting;
		
		
	}
	
	
}
