package Doubt_Class_1;

import java.util.Scanner;

public class Print_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 2; i <=n; i++) { //n tak ke sare prime no. check karne hai..chahiye
		
    	 int fact = 0;
    	    for (int j = 2; j < i; j++) { //prime 2 se start hota hai isliye 2 se check
    			
    	    	if(i%j==0) {
    	    		fact++;
    	    		break;
    	    	}
	       }
    	    if(fact==0) {
    	    	System.out.println(i);
    	    }
 	}
	}

}
