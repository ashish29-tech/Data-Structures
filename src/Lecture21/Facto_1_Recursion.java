package Lecture21;

public class Facto_1_Recursion {
    //HEAD RECURSION
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n =5;
    System.out.println(fact(n));
	}
    public static int fact(int n) {
    	if (n == 0) {
    		return 1;
    	}
    	
    	return n * fact(n-1); //pehle kaam hoga uske baad n se multiply hoga that's why HEAD RECURSION
    }
}
