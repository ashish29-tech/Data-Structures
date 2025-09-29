package Doubt_Class_1;
import java.util.*;
public class Patter_Double_SidedArrow_PattSheetHackB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int space1 = n-1; //n=7 ke liye n-1 space
    int space2 = -1; //0 space hai to -1 star so that formula ban jaye
    int star = 1; //shuru m 1 star
    int row = 1;
    int val = 1; //start 1 se karna hai. val ka kaam har row ka start nikalne ke liye
    while(row<=n) {
    	
    	//space 1
    	int i =1;
    	while(i<=space1) {
    		System.out.print("  ");
    		i++;
    	}
    	
    	//star 1
    	int j = 1;
    	int p = val; //is row m isse start hoga
    	while(j<=star) {
    		System.out.print(p+" ");
    		p--; //p 0 ban gya hoga
    		j++;
    	}
    	
    	//space 2
    	int k = 1;
    	while(k<=space2) {
    		System.out.print("  ");
    		k++;
    	}
    	
    	//star 2
    	j =1;
    	p++;
    	if(row == 1 || row == n) {
    		j=2; //j ko 2 pe shift kar denge
    	}
    	while(j<=star) {
    		System.out.print(p+" ");
    		j++;
    		p++;
    	}
    	
    	//next row prep.  //Mirroe: n/2 + 1 pe hai..4th lie pe
    	if(row<=n/2) {
    		space1-=2; // space 1 se kam ho rha hai
    		
    		space2 +=2; // 2 se badh rha hai
    		val++; // mirror se pehle value badana hai
    		star++; //1 se badh rha hai
    	}
    	else {
    		space1+=2;
    		star--;
    		space2-=2; // 2 se kam
    		val--; // mirror ke baad kam
    	}
    	row++;
    	System.out.println();
    }
    
    
	}

}
