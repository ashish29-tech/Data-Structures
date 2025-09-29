package Lecture9;
import java.util.*;
public class Array_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt(); //aray ka size input lenge
//    int [] arr = new int [n]; //array banayenge
//	  for (int i = 0; i < args.length; i++) { //for loop se input lenge
//		  arr[i] = sc.nextInt();
//	}
    int arr [] = {10, -3, 90, 7, -9, 79, -18, 902};
    System.out.println(Minimum(arr)); //function call
	}
	//Function se return karana hai to integer type ki value
    public static int Minimum (int [] arr) { //int type ke variable lena hai..name arr
    	int min = arr[0]; //0th element ko mininmum maan liya
    	for (int i = 1; i < arr.length; i++) { //1st se leke last index tak check karenge
			if (arr[i]<min) { //current val chota hai min se
				min = arr[i]; //min..arr[i] ban jaye
			}
		}
    	return min; //loop khtm hoga to min val return kar denge
    }
}
