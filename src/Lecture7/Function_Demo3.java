package Lecture7;

public class Function_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println("Hey");
		int a =9;
		int b = 4;
		add(a,b); //add function call kiya usme a & b ki value pass ki....add(9,4)
		System.out.println("Bye");
	}
	// Return type void hai...kuch print nai karega
    public static void add (int a1, int b1) { //2 no. bhej rhe hai...isme value capture ho rhi. 9&4 yaad rakh rhe hai variable m
//    	 a= 9;
//    	 b=7;
    	int c = a1 + b1;
    	System.out.println(c);
    }
}
