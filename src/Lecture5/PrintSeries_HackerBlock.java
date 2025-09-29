package Lecture5;

import java.util.Scanner;

public class PrintSeries_HackerBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scanner sc =new Scanner(System.in);
//    int n1 = sc.nextInt();
//    int n2 = sc.nextInt();
//    int n = 1;
//    for (int i = 1; i <=n1;) {
//		if((3*n+2)%n2!= 0) {
//			System.out.println(3*n+2);
//		}
//		i++;
//	}
//    n++;
      
		            
		            //ChatGpt
		Scanner sc = new Scanner(System.in);

        // Reading inputs
        int n1 = sc.nextInt();  // Number of terms to print
        int n2 = sc.nextInt();  // Divisor to check against

        int n = 1;  // Start with n = 1
        int count = 0;  // To keep track of how many valid numbers have been printed

        // Loop to print n1 terms of the series
        while (count < n1) {
            // Calculate the current value in the series
            int value = 3 * n + 2;
         // Check if the value is not divisible by n2
            if (value % n2 != 0) {
                System.out.println(value);
                count++;  // Increment count only when a valid number is printed
            }
            n++;		
        }	
	}

}
