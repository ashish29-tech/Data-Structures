package Doubt_Class_1;
import java.util.*;
public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt(); //For multiple test cases
    while (test >0) { //2 > 0....1>0.......0>0 pe nai chalega to input nai lenge. Or while(t-->0).
    int m = sc.nextInt(); //Test case input for Aayush
    int n = sc.nextInt(); //Test case input for Harshit
    int Aayush_total_phone = 0;
    int Harshit_total_phone = 0;
    int curr = 1; //pehla phone jo bhi khareedega 1 khareedega
    while(true) { //jab tak true hai tab tak chalega niche break lga hua hai so no worry
    	Aayush_total_phone+=curr; //sbse pehle aayush ne liya to usme add kar
    	
    	if(Aayush_total_phone>m) {
    		System.out.println("Harshit");
    		//if harshit jeet jata hai to no need to cont. loop
    		break; // so break lga diya
    	}
    	
    	curr++; //if nai hai to 1 se badha de. Jab Aayush m 1 hai to Harshit ko 2 diya phone.
    	Harshit_total_phone+=curr; //harshit m badha diya
    	if(Harshit_total_phone>n) { //harshit total phone greater than n hoga to
    		System.out.println("Aayush"); //Aayush win
    		break; //loop stop cuz Aayush win	
    	}
    	curr++; //agli baar jo aayush m add hoga to curr badha dete hai,   		
    }
    test--;
	}
	}

}
