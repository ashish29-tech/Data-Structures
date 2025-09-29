package Lecture9;

public class Reverse_Array {
	// 2 POINTER APPROACH. 1 is i(0 pe) and the other is j(last pe). Swap karenge
	// fir i ko aage and j ko peeche.i<j hoga tab tak kaam karenge. i>j hoga to rok
	// denge.
	// Odd ke case m:

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 4, 5, 67, 89, 10, 12 };
		ReverseArray(arr); //reverse function call
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
    //kuch return nai karenge isliye void
	public static void ReverseArray(int[] arr) {
		int i = 0; //
		int j = arr.length - 1; //j= 7-1=6
		//2 POINTER M WHILE LOOP SE BETTER REHTA HAI
		while (i < j) { //i and j equal honge to nai chalega
			//ith and jth index ki value ki swapping
			int temp = arr[i]; 
			arr[i] = arr[j]; //array of i m array of j
			arr[j] = temp;
			i++; //i aage
			j--; //j peeche
			//Heap m change hua hai to change reflect hoga...index pe jake value change kar rhe hai
		}
	}
}
