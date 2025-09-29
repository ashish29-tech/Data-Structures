package DoubtClass_4;
import java.util.*;
public class Any_To_Any_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int src = sc.nextInt(); //source base input liya
    int db = sc.nextInt(); //Destination base input
    int num = sc.nextInt(); //number input
    int num1= base10(num, src); //varible m capture kar lenge
    System.out.println(Disbase(num1,db));
	}
	public static int base10(int num, int src) { //koi bhi number ko base 10 m convert kar dega...no. and source kya hai wo bhejenge
		//purpose; koi bhi no. ko 10 base m le jao...phir 10 base se destination base m
		int ans= 0;
		int mul=1;
		while(num!=0) {
			int rem= num%10;
			ans = ans + rem*mul;
			mul*=src;
			num/=10; //no. ko chota kar denge
			
		}
		return ans;
	}
	public static int Disbase(int num, int dis) { //koi bhi number ko base 10 m convert kar dega...no. and source kya hai wo bhejenge
		//purpose; koi bhi no. ko 10 base m le jao...phir 10 base se destination base m
		int ans= 0;
		int mul=1;
		while(num!=0) {
			int rem= num% dis;
			ans = ans + rem*mul;
			mul*=10;
			num/=dis; //no. ko chota kar denge
		}
		return ans;
	

}
	
}
