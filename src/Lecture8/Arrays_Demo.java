package Lecture8;

public class Arrays_Demo { //Array_Demo ek class hai

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr; //Integer type ka 1D Array
		//Address ka by default value null hota hai
		//Class type ki chiz hai to Heap m higa
		//indexing 0 based. 0 to n-1.
    int [] arr = new int [5]; //new se Heap m space allocate hota hai
    System.out.println(arr);
//    Get
    System.out.println(arr[2]); //2nd index ka value get ho jayega
    System.out.println(arr[0]);
    
//   Set....update kar skte hai value
    arr [0] = 10; //0 index pe 10 set ho jayega
    System.out.println(arr[0]);
    
    System.out.println(arr.length); //Array ka size
    
    for(int i = 0; i<arr.length; i++ ) {
    	arr [i] = (100) * (i+1);//fisrt time: arr[0] = (100) * (0+1), then 1,2..
    	//System.out.print(arr[i]+" ");
    	System.out.println(i);
    }
    	
	}

}

//Arrays java m bani banai class hai. Array take contiguous memory. 
//Homogeneous..mtlb int hai to int...char hai to char
//Java m jo bani banai class hai ya jo ham banate hai wo they are called
// Non-Primitive Data Type
//Primitive 8. Not more than that
//Scanner class bhi non-primitive data type
//Matrix ke liye 2222D Array
