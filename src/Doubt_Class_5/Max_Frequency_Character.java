package Doubt_Class_5;
import java.util.*;
public class Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    Frequency_Character(str);
	}
   public static void Frequency_Character(String str) {
	   int [] frq = new int [26]; //frq array 26 size ka
	   for (int i = 0; i < str.length(); i++) { //string pe loop lga ke..1-1 kar ke frequency update karna hai
		   char ch = str.charAt(i); //kis char ka frq bnana hai wo nikal lenge
		   frq[ch-97]= frq[ch-97]+1;// corresponding wala index mil jayega. pehle se jo value hai usme + 1 kar denge frequency badh jaye taki. 97-97=0, 98-97=1, 99-97=2. Wapis se usi m add kar denge
		  	
	}
	   //maximum konse index pe value hai
	   int max_i = 0; //max index ko 0 maan ke chal rhe hai
	   for (int i = 1; i < frq.length; i++) { // Array pe loop
		if(frq[i]>frq[max_i]) { //if 1 index pe value jyada hai..0th index wale se to  
			max_i=1; // 1st index pe jyada milega na....to max_i ko update kar denge
		}
	}
	   char ch = (char) (97 + max_i); //jo char nikal ke ayega...typecast kar diya. jo max_i pta lga usme 97 add kar ke char nikal denge
	   System.out.println(ch);
   }
}
