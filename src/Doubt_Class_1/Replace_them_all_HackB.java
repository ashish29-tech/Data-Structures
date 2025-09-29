package Doubt_Class_1;
import java.util.*;
public class Replace_them_all_HackB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong(); //long m input
    int mul = 1; // no. bnana hai to 1 mul ki bhi need hai
    long ans = 0;
    if(n==0) { //1 test case fail hoga...0 ke liye... isliye ye if
    	ans = 5;
    }
    while(n>0) {
    	int rem = (int) (n % 10); //typecast kar ke int m kar diya
    	if(rem==0) { //0 ko 5 se replace karna hai
    		ans = ans + 5*mul; //5 m badal dega. 0 ko 5 se replace karna hai. Ans m 5 add.
    	}
    	else {
    		ans = ans + rem*mul;
    	}
    	n/=10; //no. ko chota
    	mul= mul*10; //mul ko 10 se badha de
    }
    	System.out.println(ans);
	}

}
