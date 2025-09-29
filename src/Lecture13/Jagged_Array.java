package Lecture13;
import java.util.*;
public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //asking user...row kitne hai
    int [][] arr = new int [n][]; //row ka size bta diya...column ka nai define karenge
    //take input
    for (int i = 0; i < arr.length; i++) { //array ke row pe loop
		int c= sc.nextInt(); //c input liya..column ka size btayega
		arr[i]= new int [c]; //1D array ban jayega...
    	for (int j = 0; j < arr[i].length; j++) { //jitne size ka aray bana hai utne time loop chalega
			arr[i][j]= sc.nextInt();
		}
	}
    //print
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
    	System.out.println();
	}
    
	}

}
