package Lecture13;
import java.util.*;
public class Transpose_of_a_SquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] [] arr = new int [n] [n]; //row & col dono same size ka hai..cuz square matrix hai
    for (int i = 0; i < arr.length; i++) {// col ka length...0.length likhe na likhe fark nai padta cuz square matrix hai...recyangle hota to likhte
		for (int j = 0; j < arr.length; j++) {
			arr [i][j] = sc.nextInt();
		}	
		}
    Transpose(arr);
    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	}
	
	public static void Transpose(int [] [] arr) { //function banayenge transpose nikalne ka...araay ke andar change marna hai
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = row+1; col < arr.length; col++) { //col pe loop
				int temp = arr[row][col];
				arr[row][col]= arr[col][row];
				arr[col][row]= temp;
			}
		}
	}

}
