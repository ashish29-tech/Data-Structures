package Lecture14;
import java.util.*;
public class Divisible_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); //testcase input
    while(t-->0) {  //multiple test case ke liye loop
    	int n = sc.nextInt();
    	int [] arr= new int [n];// array banayenge n size ka..
    	for (int i = 0; i < arr.length; i++) {  //upar(line 11) wale n ko input le liya 
			arr[i] = sc.nextInt();
		}
    	
    }
}
	public static long GoodSubArray(int []arr)     { // function banayenge jo hume good subarray count kar ke dega
		int n = arr.length;
		long [] frq = new long[n]; // frequency wala array banayenge jiska naam long denge 
		int sum =0;
		
	}
}









// constraint diya hai usme array ka value integer ke pass ka hai isliye long lenge...