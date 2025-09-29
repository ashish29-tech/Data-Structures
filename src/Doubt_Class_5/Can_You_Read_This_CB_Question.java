package Doubt_Class_5;
import java.util.*;

public class Can_You_Read_This_CB_Question { //On coding block
   public static void main (String [] args ) {
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next(); // String Input
	   PrintString(str);
   }
   public static void PrintString(String str) {
	   String ans = "";
	   ans = ans + str.charAt(0); //String ka 0th char string m dalte hai...i hamne ans m add kar diya
	   for (int i = 1; i < str.length(); i++) {
		char ch = str.charAt(i); //ith character string ka nikalenge
		if(ch>='A' && ch<='Z') { //if inke beech ka char hua
			System.out.println(ans); //string print and line change becoz of ln...I print ho jayega and line change 
			ans = ""; // answer ko khali kar denge
			ans = ans + ch; //to ye naya char add kar do..ex: A add kar denge..naye wala
		} 
		else {
			ans = ans + ch; //nai hai to ans m ch add kar do
		}
	}
	   System.out.println(ans); //ans m jo bacha hua content hai use print kar denge
   }
}
