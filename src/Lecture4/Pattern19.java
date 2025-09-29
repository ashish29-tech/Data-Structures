package Lecture4;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int row =1;
    int star = n/2+1; //4 star. 
    int space =-1; //-1, 1, 3..
    while(row<=n) {
    	
    	int i =1;
    	while(i<=star) {
    		System.out.print("*"+" ");
    		i++;
    	}
    	
    	int j =1;
    	while(j<=space) {
    		System.out.print("  ");
    		j++;
    	}
    	
    	int k = 1;
    	if(row==1 || row==n) {
    		k=2; //k ki value 2 set kar di
    	}
        //k 1 kam chalega...1 se chalta tha ab 2 se ch;eha 
    	while(k<=star) {
    		System.out.print("*"+" ");
    		k++;
    	}
    	//next row...mirroring
    	if(row<=n/2) {
    		star--;
    		space+=2;
    	}
    	else {
    		star++;
    		space-=2;
    	}
    	row++;
    	System.out.println();
    }
	}

}
