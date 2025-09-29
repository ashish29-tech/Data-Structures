package Lecture4;
import java.util.*;
public class GCD { //HCF

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
    int dividend =sc.nextInt(); //60;
    int divisor = sc.nextInt(); //36;
    
    while(dividend%divisor!=0) { //Divd % Diviso jab tak 0 na ban jaye tab tak kaam karna hai
    	int rem = dividend % divisor; // 60%36 = 24 first time
    	dividend = divisor; // divid abi wala diviso(36) hai
    	divisor = rem; //divisor abi wala rem(24) hai
    }
    System.out.println(divisor);
	}

}
