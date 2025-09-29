package Lecture14;
import java.util.*;
public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //row input
    int m = sc.nextInt();
    int [][] arr = new int [n][m]; //2D matrix n,m size ka bana denge
    for (int i = 0; i < arr.length; i++) { //input liya
		for (int j = 0; j < arr[0].length; j++) {
			arr[i][j] = sc.nextInt();
		}
	}
    int x = sc.nextInt(); //jo search karna hai wo input le liya
    System.out.println(Search(arr,x));
	}
	
	public static int Search(int [] [] arr, int x) {
		int row = 0; // (0,2) ka 0
		int col = arr[0].length-1; // (0,2) ka 2
		while (col>=0 && row<arr.length) { // col & row dono range m hai....column kam ho rahe...row niche ja rha
			
			if(arr[row] [col]==x) {
				return 1;
			}
			else if(arr[row][col]<x) {
				row++;
			}
			else {
				col--;
			}
		}
		return 0;
	}
	

}
