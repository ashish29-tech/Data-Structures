package Lecture8;
import java.util.*;
public class UserInput_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in); //Scanner input
    int n = sc.nextInt(); //Array ka size
    int [] arr = new int [n]; //Array bna 5 size ka
    
    for (int i = 0; i < arr.length; i++) {
    	
		arr [i] =sc.nextInt(); //Array ke har index pe scanner se input dalenge
	}
		display(arr); //5k ko point karega. Actual Parameter.....Display function call.
		
	}
	//Function bna liya.....array ke value ko display karega
	//Formal Parameter....iska name can be changed
	// brr ek variable hai jo integer ke array ka address rakhega
	public static void display (int [] brr) { //Isme brr wo bhi 5k ko point karega.
		for (int i = 0; i < brr.length; i++) { //length pe loop
			System.out.print(brr[i] + " "); //value print
		}
		System.out.println();
	}
	
	}


