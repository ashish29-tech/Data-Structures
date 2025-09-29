package DoubtClass_4;
import java.util.*;
public class Kth_Root {
 // x 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    while (t-- >0) { //post increment..pehle check hoga uske baad increment karega
    	//2 input lena hai...cuz multiple test cases hai
    	long n = sc.nextLong(); // x ko long lena padega..contraint m memtion hai...10^15 joki integer m ayega nai
    	int k = sc.nextInt();
    	System.out.println(kthroot(n,k));
    }
	}
	public static long kthroot(long n, int k) { // function ka return type integer hi rakh rhe hai...jarurat hogi to long kar lenge...kar liya long
		
		long lo=1;
		long hi= n;
		long ans = 0;
		while(lo<=hi) {
			long mid = lo +(hi-lo)/2; //long ke aas-pass ka no. hai to dusre tarike se mid nikale to behtar hai..wrna range se bhr ja skta hai
			
			if(Math.pow(mid,k)<=n) { //mid ki power k less than equal to k hai
				ans = mid;
				lo= mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans; //jo bhi answer m pada hoga wo return kar denge
		
	}

}
