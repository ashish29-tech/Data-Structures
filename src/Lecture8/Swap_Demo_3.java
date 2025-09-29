package Lecture8;

public class Swap_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {10, 20, 30, 40, 50 };
    int [] other = {100, 200, 300, 400 };
    System.out.println(arr[0] + " " + other [0]); // 10, 100
    Swap(arr, other);
    System.out.println(arr[0] + " " + other [0]); // 
	}
	//Address Swap
    public static void Swap(int [] arr, int [] other) {
    	
    	int [] temp = arr; //3rd Variable bhi arr type ka hoga..address store karna hai to uska typr btana hoga
    	arr = other;
    	other = temp;
    }
}
