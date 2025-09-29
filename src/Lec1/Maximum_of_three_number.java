package Lec1;

public class Maximum_of_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 7;
		int c = 78;
		if (a > b && a > c) { // agr pehla condition galat ho gya to dusra condition check bhi nai hoga
			System.out.println("A is greatest");
		} else if (b > a && b > c) {
			System.out.println("B is greatest");
		} else {
			System.out.println("C is greatest");
		}
		// ctrl + shift + f: Proper format
		// ctrl + f11: Run
	}

}
