package Lec1;

public class Sum_N_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    int n = 5;
//    int sum = 0;
//    int i = 1;
//    while(i<=n) {
//    	sum = sum + i;
//    	i++;
//	}
//	System.out.println(sum);
	
	            // or
	
	int n = 5; // Setting n to 5
    int sum = 0;
    int i = 1;

    while (i <= n) {
        sum += i;
        i++;
    }

    System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
	}

}
