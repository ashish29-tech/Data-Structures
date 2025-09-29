package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_Rhombus_PatternSheetHBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = 1;
    int space = n-1;
    int row = 1;
    int val = 1; //val har row ka start bta rha
    while(row<=2*n-1) {
    	
    	//space
    	int i =1;
    	while(i<=space) {
    		System.out.print("  ");
    		i++;
    	}
    	
    	//star
    	int j = 1;
    	int p = val; //p pe vertical mirroring karni hai. Mirror se pehle p badh rha hai
    	while(j<=star) {
    		System.out.print(p+" ");
    		//vertical mirroring..p ke upar
    		if(j<=star/2) { //vertical line pe
    		p++;
    		}
    		else {
    		p--;
    		}
    		j++;
    	}
    	
    	//next row prep
    	
    	if(row<n) {
    		space--;
    		star+=2;
    		val++; //mirror se pehle val inc ho rha hai
    	}
    	else {
    		space++;
    		star-=2;
    		val--; //mirror ke baad val kam ho rha
    	}
    	System.out.println();
    	row++;
    }
	}

}
