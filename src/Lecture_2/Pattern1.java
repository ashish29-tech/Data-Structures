package Lecture_2;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = 1; //row pehle 1 hogi and ise N tak leke jana hai
    int nst =n; // number of star in arow
    while(row<=n) { //row kitni baar chalana hai
    	
    	//Star Print
    	int cst = 1; //initialisation
    	while(cst<=nst) { //condition
    		System.out.print("*"+" ");
    		cst++; //re-initialisation
    	}
    	//next row preparation
    	System.out.println(); //line change
    	row++; //row change
    	
    }
    


	}

} 