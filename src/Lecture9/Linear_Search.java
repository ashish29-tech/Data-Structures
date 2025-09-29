package Lecture9;
import java.util.*;
public class Linear_Search {
    //
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //Array ka size
    int [] arr = new int [n]; //n size ka array bna liya
    for (int i = 0; i < arr.length; i++) { //n ya array.length pe loop
		arr[i] = sc.nextInt(); //1-1 kar ke elememt ko fill kar diya
	}
    //1 array given hoga. 1 item given hoga jise search karna hai
    int item = sc.nextInt(); // search wala item
//    for (int i = 0; i < arr.length; i++) {
//		System.out.print(arr[i] + " ");
//	}
//    System.out.println();
    System.out.print(Search(arr, item)); //function call
	}
    public static int Search (int [] arr, int item ) { //array and item jise saerch karna hai dono aa gya
    	for (int i = 0; i < arr.length; i++) { //0 se leke last tak loop
			if (arr [i]==item) {
				return i; //mil gya to index return 
			}
		}
    	return -1; //nai mila to -1
    }
    
}
