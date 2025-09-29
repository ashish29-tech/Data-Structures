package Doubt_Class_5;
import java.util.*;
public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    StringCompression(str);
	}
    public static void StringCompression (String str) {
    	char prev = str.charAt(0); //1st char rakh diya prev m
    	int count = 1; //count 1 rakh diya
    	String ans = ""; //match niahi kar rha hai to..khali string jisme concatinate karnge
    	for (int i = 1; i < str.length(); i++) { //1st se loop lgayenge
    		char curr = str.charAt(i); //abhi/current wala char nikalenge..i wala
			if(prev==curr) { //Previos char matches with the current one
				count++; //count badha diya
			}
			else {
				ans = ans + prev + count; // concatinate kar denge..ans m jo bhi pehle se tha
				prev = curr; //aaabbccds....1st time a3 hone baad b jo current hai wo use prev bna denge
				count = 1; //count ko wapis 1 set kar denge...b ka count 1 hoga
			}
		}
    	
    	ans = ans + str.charAt(str.length()-1) + count; //purane ans m last char ko add kar lenge..and uska jo bhi count hai use add kar denge
    	System.out.println(ans); //ans print
    }
}
