package Lecture4;

import java.util.Scanner;

public class Sum_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		// no. ko chota karna ho like n/10 to normally while loop
//		while (n > 0) {
//			int rem = n % 10; //2351%10 = 1
//			sum += rem; // sum = sum +rem;
//            n = n/10; // 2351/10 = 235
//		}
//		System.out.println(sum);
		          
		          //OR
		
		int sum = 0;
		for(int n = sc.nextInt(); n>0; n=n/10) {
			int rem = n%10;
			sum += rem;
		}
		System.out.println(sum);
	}

}
