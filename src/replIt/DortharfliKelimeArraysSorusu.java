package replIt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DortharfliKelimeArraysSorusu {

	public static void main(String[] args) {
		

		String [] s={"Tomato", "Potato", "Pair"};
		
		 System.out.println(Arrays.toString(isFourLetters(s)));
	}

	public static String[] isFourLetters(String[] s) {
		  
//		  
//	    char str[]=new char[s.length];
//	   
//	    String sonuc="";
//   
//	    for (int i=0; i<s.length; i++){
//	      sonuc=s[i];
//	      if(i<sonuc.length()){
//	        
//	        str[i]=sonuc.charAt(i);
//	     
//	    }else{
//	      break;
//	    }
//	    
//	  }
//	  sonuc=new String(str);
//	  
//	  return sonuc;
		
		List<String> list = new ArrayList<>();
		 
		 for(int i = 0 ; i < s.length ; i++) {
				if(s[i].length() == 4) {
					list.add(s[i]);
					}
				
		 }
		 
		String arr[] = list.toArray(new String[0]);
		 
		 return arr;   

}
	}

