package Lec19;

public class Pridyct_Less_Than_K {
    //Sliding Window....FLexible cuz size isn't fixed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = {1, 2, 3, 4, 2, 3};
     int k = 0;
     System.out.println(countnofSubarray(arr, k));
	}
     public static int countnofSubarray(int [] arr, int k) {
    	 
    	 int si =0;
    	 int ei = 0;
    	 int ans = 0; //jo ki total count btayega
    	 int p = 1; //window ka product. Initially 1 cuz product karna hai...0 se to mul karne pe 0 ho jata
    	 while(ei<arr.length) {	 
    		 //Wondow grow
    		 p= p*arr[ei]; //1 element window m add ho gya
    		 //Window small/shrink
    		 while(p>=k && si<=ei) { //window tab tak chota karna tha jab tak jab tak product gretaer than k na ho jaye. 1,2,3 mul ho jayenge jaise hi 4 mul hoga srink 
    			 p= p/arr[si]; //1,2,3,4 hoga uske baad shrink karenge...to 1 bhr karenge.....4*3*2*1...24/1= 24
    			 si++;
    		 }
    		 //ans calculate
    		 ans = ans + ei - si + 1;
    		 ei++;	 
    	 }
    	 return ans;
     }
}
