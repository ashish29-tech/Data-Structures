package Lecture13;
import java.util.*;
public class Input_and_Display_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //Row ka size
    int m = sc.nextInt(); // Column ka size
    int [] [] arr = new int [n] [m];
//    System.out.println(arr[2][2]);
    
    //Take input
    for (int i = 0; i < arr.length; i++) {
		
    	for (int j = 0; j < arr[0].length; j++) { //sare column ka length same hai to 0 rakha hai..i nai rakha cuz later we'll use 0
			arr [i][j] = sc.nextInt();
			
		}
	}
    
    //print
for (int i = 0; i < arr.length; i++) {
		
    	for (int j = 0; j < arr[0].length; j++) { //ye for loop ek 1D array create karega...i ki value change hogi to dusra
			System.out.print(arr[i][j] + " ");
			
		}
    	System.out.println();
	} 

    
	}

}
