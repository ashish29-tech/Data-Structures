package Lecture6;

public class Dec_Bin_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int n =45;
		int mul = 1; //multiplier pehli baar hua 10 to the power 0
		int ans = 0; //jo track rakhega. rem * mul...ans m add kar denge
		
		while(n>0) { //jab tak n 0 na bane tab tak.
			int rem = n%2;
			ans = ans + rem * mul ; //rem * mul...ans m add kar denge
			mul = mul*10; //next time 10^1, 10^2...10 se aage ja rha hai
			n /=2; //no. ko 2 se chota karna hi tha 		
		}
		System.out.println(ans);
	}

}
