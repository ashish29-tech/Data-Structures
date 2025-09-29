package Lecture3;

import java.util.Scanner;

public class Pattern8 {
    //Mirror n/2+1 pe hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1;
    int space = n-2;
    int space1 = 0;
    while(row<=n) {
    	int j = 1;
    	while(j<=space1) {
    		System.out.print("  ");
    		j++;
    	}
    	System.out.print("*"+" ");
    	int i = 1;
    	while(i<=space) {
    		System.out.print("  ");
    		i++;
    	}
    	if(row!=(n/2)+1) {
    	System.out.print("*"+" ");
    	}
    	if(row<=n/2) {
    		space = space-2;
    		space1++;
    	}
    	else {
    		space = space+2;
    		space1--;
    	}
    	row++;
    	System.out.println();
    }
	}

}
