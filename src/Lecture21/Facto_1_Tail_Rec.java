package Lecture21;

public class Facto_1_Tail_Rec {
    //TAIL RECURSION
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n =5;
    System.out.println(fact(n, 1));
	}
    public static int fact (int n, int ans) { //n=5, ans=1
    	
    	if (n == 0) {
    		return ans;
    	}
        
        return fact(n-1, ans * n); //ans banta hua jayega...120 banne pe n = 0 ho jayega and wapis girte waqt 
        //koi task nai karna that's why TAIL RECURSION
    }
	
}
