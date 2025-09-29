package Lecture9;

public class Reverse_Range { //i and j ke beech ke range ko reverse

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
    int [] arr = {23,4,5,67,89,10,12,90,78,8,-1,24};
    //i and j user dega
    int i = 2; //index 2 se. p
    int j = 5; //index 5 tak ki swapping. q
    Reverse(arr, i, j); //p,q
    for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k] + " ");
	}
	}
	public static void Reverse(int [] arr, int i, int j) { //ith and jth ke beech ki swapping
		
		while (i<j) {
			int temp = arr [i];
			arr [i] = arr [j];
			arr [j] = temp;
			i++; 
			j--;
		}
		
	}
	
}
