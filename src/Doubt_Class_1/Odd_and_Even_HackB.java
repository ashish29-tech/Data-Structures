package Doubt_Class_1;

import java.util.Scanner;

public class Odd_and_Even_HackB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); //Multiple test case input
    while(t-->0) { //post decrement. Kitni baar run karwana hai uske liye ye while loop
    int n = sc.nextInt(); 
    int odd = 0;
    int even = 0;
    while(n>0) { //n>0 tab tak
    	int rem = n%10; //rem nikala
    	if(rem%2==0) { //check kiya odd hai ya even
    		even+=rem; //even wale m sum kar denge
    	}
    	else {
    		odd+=rem; //wrna odd wale m sum karenge
    	}
    	n=n/10; //no. chota
    }
    if(even%4==0 || odd%3==0) {
    	System.out.println("Yes"); //sunday ko allow karenge
    }
    else {
    	System.out.println("No"); //unday ko allow nai karenge
    }
    }
	}

}
