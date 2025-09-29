package Lec16;
import java.util.*;
public class Playing_with_good_substring { //this problem is lil bit like max subarray
  //constraint m hona chahiye...all char will be in lower case
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    String str =sc.next(); // string input liya
    System.out.println(PlayingWithGoodString(str));
	}
	public static int PlayingWithGoodString (String str) { //length return kar rhe hai that's why int type
		int ans=0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i); //ith char nikala
			if(vowels(ch)==true) { //agr ye jo char nikala wo vowel hua to
				count++; //count aage badha denge 
			}
			else {
				ans = Math.max(ans, count); // nai hai to answer update kar rhe the
				count=0; //and count ko 0 set kar de rhe the
			}
		}
		ans = Math.max(ans, count); //ek bar aur answer update...means age last m sbase vowel milta gya to ho skta hai whi max length ka ho
		return ans;
	}
    
	public static boolean vowels(char ch) { //function banayenge vowel chack karne liye..ye char vowel hai ya nai
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='0'|| ch=='u' ) {
			return true; //inme se match kar gya to return true
	}
		return false;
		
	}
}
