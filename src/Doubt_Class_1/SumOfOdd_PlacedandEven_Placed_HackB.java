package Doubt_Class_1;

import java.util.Scanner;

public class SumOfOdd_PlacedandEven_Placed_HackB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos = 1;
    int odd = 0;
    int even = 0;
    while(n>0) {
    	int rem = n%10;
    	if(pos%2==0) {
    		even+=rem;
    	}
    	else {
    		odd+=rem;
    	}
    	pos++;
    	n=n/10;
    }
    
	}

}
