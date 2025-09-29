package Lecture7;
import java.util.*;
public class Is_Armstrong_Number { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //n ka range integer m hai to usse bhr nai jayenge
    System.out.println(IsArmstrongNumber(n)); //call kar liya and check kar ke btayga if armstrong or not
    
	}
	//Armstrong True or False btana hai isliye boolean...method type: boolean
	public static boolean IsArmstrongNumber (int n ) { //isme n bheja to check Armstrong hai ya nai
		int d = countofdigit(n);//function call kar lo wo count of digit de dega. value pass hota hai var nai.
		int ans = 0;
		int temp =n; //n ko temp naam ke variable m rakh lete hai...yaad kar liya
		while (n>0) {
			int rem = n%10; //rem
			//power function double type ki value deta hai..so typecast in integer
			ans = (int) (ans + Math.pow(rem, d)); //ans m jo kuch bhi hai..usme add kar do Math.pow. Ex: rem 7 then 7^3
			n/=10;
		}
		if (ans==temp) { //temp se check kar lenge. ans ko 371 se check karna tha. Ans 0 ho gya tha isliye temp se check
			return true;
		} else {
			return false;
		}
	}
   
	public static int countofdigit(int n) {//Aisa function banana jisme n bheju and wo count of didit bta de
		int c = 0; //count
		while(n>0) { //rem ki jrurat nai hai...
			n= n/10; //n/=10	
			c++; //count nikalenge and 1 se badha denge
		}
		
		return c; //Jo bhi count hoga use return kra denge
	}
}
