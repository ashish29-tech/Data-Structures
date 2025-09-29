package Lecture3;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nsp = n-1;
	    int nst = 1;
	    int row = 1;
	    while(row<=n) {
	    	int csp = 0;
	    	while(csp<nsp) {
	    		System.out.print("  ");
	    		csp++;
	    	}
	    	int cst =1;
	    	int val = row;
	    	while(cst<=nst) {
	    		System.out.print(val+" ");
	    		if(cst<(nst/2)+1) {
	    			val++;
	    		}
	    		else {
	    			val--;
	    		}
	    		
	    		cst++;
	    	}
	    	System.out.println();
	    	nsp--;
	    	nst+=2;
	    	row++;
	    }
		}

	}