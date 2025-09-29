package Lecture6;

public class Bin_to_Deci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10010; // Pta krna hai ye binary ka kon sa no. hai
		int mul = 1;
		int ans = 0;
		while (n > 0) {
           int rem = n % 2;
           ans = ans + rem * mul;
           mul = mul * 2;
           n /= 10;
           
		}
       System.out.println(ans);
	}

}
