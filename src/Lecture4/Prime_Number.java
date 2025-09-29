package Lecture4;

import java.util.Scanner;

public class Prime_Number {
// Any no. b/w 2 to n-1 which completely divides n then it's not a prime number else prime
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 0; //factors count kar lenge
    for (int i = 2; i < n; i++) { //i<n hai to n-1 tak loop chalega
		if(n%i == 0) {
			fact++;
		}	
	}
    if(fact>=1) {
    	System.out.println("Not Prime");
    }
    else {
    	System.out.println("Prime");
    }
    
	}

}
