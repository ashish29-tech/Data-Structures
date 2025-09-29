package Doubt_Class_1;

import java.util.Scanner;

public class Inverted_HourGlass_PatternSheetHackB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = 1;
    int space = 2*n-1;
    int row = 1;
    while(row<=2*n+1) {
    	
    	//star
    	int i =1;
    	//Har jgah 5 se start ho rha isliye andar hi bna lete hai upar wale while ke
    	int val =n;
    	while(i<=star) {
    		System.out.print(val+" ");
    		val--; //val dec ho rha hai
    		i++;
    	}
    	
    	//space
    	int j =1;
    	while(j<=space) {
    		System.out.print("  ");
    		j++;
    	}
    	
    	//star
    	int k=1;
    	val++; //val ko set kar diya. Jha se khtm hua whi se start karna tha..
    	if(row==n+1) {
    		k =2;
    		val++; //particular row ke liye val set ho jaye..mirror line pe
    	}
    	while(k<=star) {
    		System.out.print(val+" ");
    		k++;
    		val++;
    	}
    	//next row prep
    	if(row<=n) {
    		star++;
    		space-=2;  		
    	}
    	else {
    		star--;
    		space+=2;
    	}
    	System.out.println();
    	row++;
    }
	}

}
