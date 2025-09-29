package Lecture4;

import java.util.Scanner;

public class Break_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int fact = 0; //factors count kar lenge
	    for (int i = 2; i < n; i++) { //i<n hai to n-1 tak loop chalega
			if(n%i == 0) {
				fact++;
				break;
			}	
		}
	    if(fact==1) {
	    	System.out.println("Not Prime");
	    }
	    else {
	    	System.out.println("Prime");
	    }
	}

}
