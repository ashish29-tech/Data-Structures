package Doubt_Class_5;
import java.util.*;
public class String_odd_even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    Odd_Even_Character(str);
	}
    public static void Odd_Even_Character (String str) {
    	String ans = "";
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i); //current char nikal liya
			if(i%2==0) {
				ans = ans + (char)(ch+1); //higher wala ASCII chahiye isliye ch+1..as a string concatinate ho jayega numerical value use char m typecast karo. Even hai to
			}
			else { //nahi hai to else
				ans = ans + (char)(ch-1); //Odd hai to 1 peeche wala
			}
		}
    	System.out.println(ans);
    	
    }
	
}
