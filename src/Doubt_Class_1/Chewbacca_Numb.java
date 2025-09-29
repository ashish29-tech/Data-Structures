package Doubt_Class_1;
import java.util.*;
public class Chewbacca_Numb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong(); //long input lena hai to long kar diya. int se integer range ka input
//    double d = sc.nextDouble(); //double input
//    char ch = sc.next().charAt(0); //char input. String ka 0th character input lena chahte hai.
    long ans = 0; //original no. or inverted no. rakhega(new no.). long cuz long se possible hai long m hi aye after inverting
    long mul = 1; //no. bnana hai isliye multiplies
    while(n>9) {
    	int rem = (int) (n % 10); //possible rem long m aye isliye int error. So either take long or typecast. n%10 se 1 digit ajayegi
    	if(rem>=5) { //9-rem bada hai rem se to as it is return. while(9-rem>rem)
    		int t = 9-rem;
    		ans = ans + t*mul;
    		
    	}
    	else {
    		ans = ans + rem * mul; //2376 = 2*1000 + 3*100 + 7*10 + 6*1;
    	}
    	mul = mul*10; //10 se aage badha diya. pehle 1 then 10..100...1000
    	n/= 10; //no. 1 digit chota
    }
    if(n==9 || n < 5) { //9 se bada hai to....1,2,3,4...ye do hi cases the as it is n ke
    	ans = ans + n*mul; //ans m jo kuch bhi hai
    }
    else {	
    		int t =(int) (9-n); //9-n karenge
    		ans = ans + t * mul;	
    }
    
    System.out.println(ans);
    
	}

}
