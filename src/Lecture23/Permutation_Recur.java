package Lecture23;

public class Permutation_Recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "abc";
    printPermutation(str, ""); //question nai hai to str....ans m khali...question m str(abc example)
	}
    public static void printPermutation(String ques, String ans) { //ek ques and ek ans bhejenge
     if(ques.length()==0) { //base case 
    	 System.out.println(ans); //print
    	 return;
     }
    	//jitne length ki string utni recursive call..and it depends ki har frame m string ki length kya hai
    	for (int i = 0; i < ques.length(); i++) { //for loop question wale length ke upar...0 se ques.length
			//ans m ith char ko add karenge...baki(question wala atring) ko concatinate kar ke bhej denge
    		
    		String ros = ques.substring(0, i) + ques.substring(i+1); //0 se leke i & i+1 tak substring ye question m pass karenge. Substring m last wala nai ata
    		char ch = ques.charAt(i);
    		printPermutation(ros, ans + ch);//print m call..
    		
		}
    }
}
