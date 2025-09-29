package Lecture21;

public class First_Occur_Recur {
    //TAIL RECURSION
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = {2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3};
     System.out.println(FirstIndex(arr, 0, 3)); //Array ye haii..zero se start karna hai and 3 pe rok dena hai
		
	}
    public static int FirstIndex (int []arr, int i, int item) { //array ka addres, i=0 jo hai wo, item=3 ye teeno jayenge stack m
    	//Array chota karne ke liye index maintain kiya karenge
    	if(i==arr.length) { //i last index ke barabar. Index ke case m sbse pehle length check karna padta hai.
    		return -1; //nai mila to -1
    	}
    	
    	if(arr[i] == item) { //pehle hi mil gya toh whi se return. Element access kar rhe hai
    		return i;
    	}
    	
    	return FirstIndex(arr, i+1, item); //nai mila to array m i+1 se leke entire index tak dhundhna hai
    
    }
	
	
}
