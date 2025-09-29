package Lec15;

public class String_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String str = "abcdef";
		
		System.out.println(str.charAt(3)); //charAt ek function hai...character ko get ke liye use karte hai
		System.out.println(str.substring(0, 6)); //.substring....ye last wala index nai leta hai...dono ke beech ka content print kar diya
		String s1 = str.substring(2,5); //store kar liya s1 m...substring method pool se bahar banega
		System.out.println(str.substring(2)); //ek hi index bhejenge to wha se lekar...last tak sara print ho sath hai
		System.out.println(str.substring(1,1)); //ye nai chalega..confused hai 
		
		System.out.println(str.concat(s1)); //jaise plus sign hota hai wiase hi ye cocat method hota hai...str m s1 ko add kar dega 
		String s2="Abde";
		System.out.println(str.compareTo(s2)); // compareTo function dictionary order m string ko compare karta hai..str bada hoga s2 se..toh positive value ayegi..ascii value concept
		if(str.compareTo(s2)>0) {
			System.out.println(str);
		}
		else {
			System.out.println(s2);
		}
	}

}
