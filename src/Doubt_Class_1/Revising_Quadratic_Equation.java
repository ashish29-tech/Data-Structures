package Doubt_Class_1;

import java.util.*;

public class Revising_Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b * b - 4 * a * c; // D = b^2 - 4ac
		if (d < 0) {
			System.out.println("Imaginary");
		} else if (d == 0) {
			System.out.println("Real and Equal");
			int r1 = -b / (2 * a); // If D = 0, then root will be -b / 2a
			System.out.println(r1 + " " + r1);
		}
		else { //real and distinct
			System.out.println("Real and Distinct");
			//Double type ki value dega isliye typecast
			int r1 = (int) ((-b - Math.sqrt(d))/(2*a)); //Math.sqrt is a function. -b + underroot D / 2a
			int r2 = (int) ((-b + Math.sqrt(d))/(2*a)); // -b + underroot D / 2a
			System.out.println(r1 + " " + r2);
		}
	}

}
