package Lecture3;

import java.util.Scanner;

public class Pattern16_Sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int nst = n;
    int nsp = n-1;
    while(row<=2*n-1) {
    	int csp = 0;
    	while(csp<nsp) {
    		System.out.print("  ");
    		csp++;
    	}
    	int cst = 0;
    	while(cst<nst) {
    		System.out.print("*"+" ");
    		cst++;
    	}
    	
    	 if(row<n) {
    	    	nsp--;
    	    	nst--;
    	    }
    	    else {
    	    	nst++;
    	    	nsp++;
    	    }
    	 System.out.println();
    	    row++;
    }
	}

}
		
		
		