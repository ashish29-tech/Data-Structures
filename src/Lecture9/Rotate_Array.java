package Lecture9;

public class Rotate_Array { 
	//LEETCODE Question no. 189

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {1,2,3,4,5,6,7};
	int k = 3;
	RotateArray(arr, k);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	}
	public static void RotateArray (int [] arr, int k) {
		k = k % arr.length;
		for (int j = 1; j <=k; j++) {//Hame K rotation chahiye...
		int temp = arr [arr.length-1]; //last wale index ko temp var m save 
		
		//peeche se loop chalana hai aur 0 tak jana hai
		for (int i = arr.length-2; i>=0; i-- ) { //i-- cuz peeche se. To i=5, i=4 aise chalega
			arr [i+1] = arr [i]; //arr of i+1 m arr of i ki val
			
		}
		arr [0] = temp; //0th index pe temp rakh diya
		}
	}
}
