package Lecture8;

public class Swap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 10;
    int [] arr = {10, 20, 30, 40, 50}; //hard code array.Heap m 10,20,...50 ban jayega
//    int [] other = arr;
    
    System.out.println(arr[0] + " " + arr[1]); //10, 20
    swap_method(arr[0], arr[1]); //Swap method call kiya...0 & 1 ki value swap kar de
    System.out.println(arr[0] + " " + arr[1]); //Print kara.Swap local function ke variable m hua hai isliye a=10 and b=20 hi rahega
  
    
	}
	///Swap local function ke variable m hua hai
	public static void swap_method (int a, int b) { //a m10 and b m 20 jayega
		int temp = a; //temp m 10
		a = b; //a m 20
		b = temp; //b m 10
		System.out.println(a + " " + b);
		
	}

}
