package Lecture7;

public class FUnction_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Hey");
     
     int a = 9;
     int b = 23;
     System.out.println(add(a,b)); //Variable ki val pass ho rhi...9,23	
     
     System.out.println("Bye");
	}
    //Int likha hai so is function se kuch return karenge
	public static int add(int a, int b) {
		// TODO Auto-generated method stub
		
		int c = a+b;
		return a + b; //a and b ki val add kar ke return
		
	}
   
}
