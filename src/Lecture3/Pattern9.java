package Lecture3;

import java.util.Scanner;

public class Pattern9 {

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
    	while(cst<=nst) {
    		System.out.print("*"+" ");
    		cst++;
    	}
    	System.out.println();
    	nsp--;
    	nst+=2;
    	row++;
    }
	}

}
