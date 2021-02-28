package replIt;

import java.util.Scanner;


public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc=new Scanner(System.in);
	    
	   // int num1=sc.nextInt();
	    //int num2=sc.nextInt();
	   System.out.println(isEquals(1,3));
	   
	   System.out.println(animals(2,3,4));
	  }
	  public static boolean isEquals(int num1, int num2) {
	  
	    //Write your code here

	    if(num1==num2){
	    return true;
	    }else {
	    return false;
	    }
	    
	    
	    }
	   
	    public static int animals(int tavuk, int inek, int keci){
	        //int sum=0;
	        // write your code here
	       // Scanner sc=new Scanner(System.in);
	        //int inek=sc.nextInt();
	        //int tavuk=sc.nextInt();
	        //int keci=sc.nextInt();
	        
	        int sum=inek*4+tavuk*2+keci*4;
	        
	        return sum;

	}

}
