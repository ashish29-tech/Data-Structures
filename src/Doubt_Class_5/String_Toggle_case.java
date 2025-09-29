package Doubt_Class_5;
import java.util.*;
public class String_Toggle_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    Toggle(str);
	}
    public static void Toggle(String str) {
    	String ans = "";
    	for (int i = 0; i < str.length(); i++) {
			
    		char ch = str.charAt(i);
    		if (ch>='A' && ch<= 'Z') {
    			ans = ans + (ch+32); //B=66, b= 98....typecast kar diya...Capital A se a ka 32...B se b 32...
    			
    		}
    		else {
    			ans = ans + (char) (ch-32); //lowest se highest m jana hai isliye...small abcd hai to usko capital m convert karna padega. Capital ABCD ka ASCII val kam hota hai 
    		}
		}
    	System.out.println(ans);
    }
}
