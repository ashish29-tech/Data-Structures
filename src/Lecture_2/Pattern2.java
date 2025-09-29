package Lecture_2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int star = 1;
    while(row<=n) {
    	
    	
    	//star
    	int cst =0;
    	while(cst<star) {
    		System.out.print("*"+" ");
    		cst++;
    	}
    	//2nd row preparation. Can be written in any order
    	row++;
    	star++;
    	System.out.println();
    }
	}

}
