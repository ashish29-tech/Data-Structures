package Lecture22;

public class BoardPath { //1, 2, 3 step ki chalang

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 4; 
    System.out.println("\n" + BoardPath(n, 0, "" )); //end, curr, string. 7 niche ajaye uske liye forward slash n
	}
    public static int BoardPath(int end, int curr, String ans) {
    	if(curr== end) { //curr...end ke barabar phochte hi
    		System.out.print(ans + " "); //ans print kar de
    		return 1; //1 ways mil gya
    	}
    	if(curr>end) { //2nd base case...jha jana tha usse aage chale gye..
    		return 0; //hame koi ways nai mila
    	}
    	//string + integer = string....string + integer...string hota hai
     int fp = BoardPath(end, curr+1, ans+1);// curr m 1 add, ans m 1 add.....fp= first possibility
     int sp = BoardPath(end, curr+2, ans+2); //2 ka jump lenge to ans m 2 add kar denge
     int tp = BoardPath(end, curr+3, ans+3);
     return fp+ sp + tp; //teeno ans ko combine kar ke return kar dena hai
     
     
     
    }
     
    //For loop for more than 3 recursive call
     
     public static int Boardpath1(int end, int curr, String ans) {
 		if (curr == end) {
 			System.out.print(ans + " ");
 			return 1;
 		}
 		if (curr > end) {
 			return 0;
 		}
// 		int fp = Boardpath1(end, curr + 1, ans + 1);
// 		int sp = Boardpath1(end, curr + 2, ans + 2);
// 		int tp = Boardpath1(end, curr + 3, ans + 3);
 		int count = 0;
 		for (int dice = 1; dice <= 3; dice++) {
 			count = count + Boardpath1(end, curr + dice, ans + dice);
 		}

 		return count;

    }
}
