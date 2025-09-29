package DoubtClass_4;
import java.util.*;
public class Calculate_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int [n]; // array bana lete hai
    for (int i = 0; i < arr.length; i++) { // array input kara lete hai....1,2,3,4,5
		arr[i]= sc.nextInt();
		
	}
    //har operation m input 
    int q = sc.nextInt(); //input le lete hai...q=2
    // chahe to function bana ke kar skte hai 
    while(q-->0) { //q times loop chala dete hai...1st time loop chalega to 1 lenge..2nd time 0
    	int x= sc.nextInt(); //x input diya loop ke andar
    	int [] brr= new int [n];//we'll create new array to go from old array to new one
    	// jab i-x<0 ho jayega to usme + n...(i+n) kar denge
    	for (int i = 0; i < arr.length; i++) {
			int j =i-x; //i-x ko j m store kar rhe hai....2nd time m i-x=j ho jayega to..6+6, 3+3, 5+5...etc hoga
			if(j<0) { //jab j ki vlue -ve hogi tabhi chalega
				j=j+n; //jitna anticlockwise m piche jana matlab utna clockwise m aage jana	
			}
			brr[i]=arr[i]+arr[j]; // new array m 6 aa gya pehle..1+5 kar ke....2nd time m i & j dono 6 ho jayenge...so 6+6=12, 3+3=6, 
		}
    	arr= brr; //original array ise bana denge 
    }
    //jab q operation khatm ho jayega..toh hame array ka sum hi to nikalna tha 
    int sum =0;
    for (int i = 0; i < arr.length; i++) {
		sum = sum + arr[i];
	}
    //final answer ko modulo lena hai 10*9+7
    sum = sum%1000000007; //10*9+7
    System.out.println(sum);
	}

}
