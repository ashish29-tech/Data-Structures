package Lecture_2;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int nst = n;
    while(row<=n) {
    	int cst =0;
    	while(cst<nst) {
    		System.out.print("*"+" ");
    		cst++;
    	}
    	System.out.println();
    	row++;
    	nst--;
    }
	}

}
