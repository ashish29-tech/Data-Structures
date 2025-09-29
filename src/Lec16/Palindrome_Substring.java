package Lec16;

public class Palindrome_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str ="nitin";
	paliSub(str);
}
	   public static void paliSub(String str) {
	    	for (int i = 0; i < str.length(); i++) {
				for (int j = i+1; j < str.length(); j++) {
					String s1=str.substring(i,j); //pichle question m yhi string ko print kar rhe the...ise yaad kar liya s1 m
					if(isPalindromeString(s1)==true) { // s1 palindrome hoga
						System.out.println(s1); //tbhi print karenge
					}
				}
			}	
	   }
	   //ye check kar rha hai palindrome hai ya nai
	   public static boolean isPalindromeString(String strr) {//strr pass kar denge
		   int i =0;
		   int j=strr.length()-1; //last char pe index rakhna hai
		   //2 pointer approach hai to while rakhenge
		   while(i<j) { //jab i j ke barabar ho jayga to = ka use karne ka koi mtlb nai hai....cuz char match kar jayega
			   if(strr.charAt(i)!=strr.charAt(j)) { //if string ka ith character match nai kiya string ke jth char se..
				   return false; //toh keh denge palindrome nai hai
			   }
			     i++; //match karta to
			     j--;      
		   }
		   return true;
		   
		   
	   }
	   
	   
}


