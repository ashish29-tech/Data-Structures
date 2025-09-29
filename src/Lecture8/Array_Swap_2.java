package Lecture8;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {10, 20, 30, 40, 50};
    
    System.out.println(arr[0] + " " + arr[1]); //10, 20
    swap(arr, 0, 1); //Array bheja, 0th bheja and 1st index bheja
    System.out.println(arr[0] + " " + arr[1]); // 
	}
    public static void swap (int arr [],  int i, int j) {//1 array bheja and 2 index pass kiya.Ith m 0 and Jth m 1 
    	int temp = arr[i];
    	arr[i] = arr[j];   
    	arr[j] = temp;
    	
    }
}
