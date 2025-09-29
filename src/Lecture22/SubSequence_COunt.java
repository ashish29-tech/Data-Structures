package Lecture22;

public class SubSequence_COunt {
    static int count =0; //count static le liya. static variable global variable hota hai. Static count kisi function ke andar nai likhte..class ke andar likhte hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "abc";
    printSubSeq(str, "");
    System.out.println(count); //count print 
	}
    
	public static void printSubSeq(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			count++; //jab-jab base case hit karega count++ hoga
			return;
		}
		char ch = ques.charAt(0);
		printSubSeq(ques.substring(1), ans);
		printSubSeq(ques.substring(1), ans + ch); 
	}
}
