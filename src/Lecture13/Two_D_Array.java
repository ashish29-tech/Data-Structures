package Lecture13;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][] arr = new int [3][4];
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    int [][]ar=new int [3][];
    System.out.println(ar[0]);
    int [][] other=arr;
    System.out.println(arr);
    System.out.println(other);
    
    //row ki length...N*M...N 
    System.out.println(arr.length);
    
    //column ka length
    System.out.println(arr[0].length);
    
	}

}
