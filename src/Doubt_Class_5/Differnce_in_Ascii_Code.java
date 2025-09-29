package Doubt_Class_5;
import java.util.*;
public class Differnce_in_Ascii_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    Ascii_Codes(str);
	}
    public static void Ascii_Codes(String str) {
    	
    	String ans = ""; //
    	char prev = str.charAt(0); //prev char jo ki 0th char hoga
    	for (int i = 1; i < str.length(); i++) {
			 char curr = str.charAt(i); //Current char
			 ans = ans + prev + (curr-prev); //curr-prev internally typecast ho jayega integer m and differnce dega numerically...ex: c-a= 99-97= 2
			 prev = curr;
		}
    	ans = ans + prev;
    	System.out.println(ans);
    }
}
