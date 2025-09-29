package Lecture22;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 3;
		Parenthesis(n, 0, 0, ""); //opening =0, closing =0, 
	}
	public static void Parenthesis (int n, int opening, int closing, String ans) {
		if (opening ==n && closing==n) { //opening & closing dono n ke barabar ho
			System.out.println(ans);
			return;
		}
		if(opening<n) { //opening ka call tab jayega jab value less than n ho
			Parenthesis(n, opening+1, closing, ans+"("); //open ka call
		}
		if(closing<opening) { //closing call tab jab opening se kam ho
			Parenthesis(n, opening, closing+1, ans+")"); //close ka call
		}
		
		
		
	}

}
