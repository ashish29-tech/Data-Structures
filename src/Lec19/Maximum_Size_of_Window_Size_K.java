package Lec19;

public class Maximum_Size_of_Window_Size_K { //Sliding Window
    //FIXED SIZE SLIDING WINDOW
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {1, 2, 7, 5, 11, 3, 2, 1};
    int k = 3;
    
	}
   public static int MaximumSum (int [] arr, int k) {
	   
	   //Pehle first window banana hai
	   int sum = 0;
	   for(int i = 0; i<k; i++) { // 0 se leke k-1 tak add ho jayega 1st window m.....1,2,7 ispe loop lagega and add ho jayega
		   sum+=arr[i]; //Pehle window ka sum..1,2,7...=10....next time 11 add hoga
	   }
	   
	   int ans = sum; //ans and sum dono 10....next time dono 11
	   //To create second window we'll have to remove 1 from 1,2,7 so that next window 2,7,5 cand be created. so k-1. 
	   for(int i = k; i<arr.length; i++) { //i se leke array.length tak loop. 1,2,7 already add kar chuke hai...5 se start hoga
		   sum+=arr[i]; //Window m ek element add karna hai...10 m 5 add kar rhe hai
		   sum-=arr[i-k]; //Sum m se ek element remove bhi karna hai...15-1= 14
		   ans = Math.max(ans, sum); //ans update karenge...ans & sum m se jo bada hai wo ans m chale jayega. current window ka sum purane wale se compare
	   }
	   return ans;
   }
	
	
}
