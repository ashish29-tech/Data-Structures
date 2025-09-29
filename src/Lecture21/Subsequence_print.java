package Lecture21;

public class Subsequence_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String str = "abc";
		
		printSubSeq(str, "");
	}
    public static void printSubSeq(String ques, String ans) {
    	if(ques.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	
    	char ch = ques.charAt(0); // a
    	printSubSeq(ques.substring(1), ans);
    	printSubSeq(ques.substring(1), ans + ch);
    }
}
