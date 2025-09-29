package Lecture3;

import java.util.Scanner;

public class Pattern13 { //1st Mirror Pattern
  //Jis line pe mirror lag rha hai wha se last tak else m jayega baki upar ka if m
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = 0;
		while (row <= 2 * n - 1) {

			int cst = 0;
			while (cst < nst) {
				System.out.print("*" + " ");
				cst++;
			}
			int csp =0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			System.out.println();
			if(row>=n) {
				nsp++;
				nst--;
			}
			else {
				nsp--;
				nst++;
			}
			
			row++;
			
		}
	}

}

		
		