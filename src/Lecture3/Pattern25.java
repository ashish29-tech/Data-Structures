package Lecture3;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int nsp = n-1;
		    int nst = 1;
		    int row = 1;
		    int val =1; //variable bhr banaya hai so that value wapis se 1 pe reset na kare
		    while(row<=n) {
		    	int csp = 0;
		    	while(csp<nsp) {
		    		System.out.print("\t");
		    		csp++;
		    	}
		    	int cst =1;
		    	while(cst<=nst) {
		    		System.out.print(val+"\t");
		    		cst++;
		    		val++;
		    	}
		    	System.out.println();
		    	nsp--;
		    	nst+=2;
		    	row++;
		    }
			}

		}