package Doubt_Class_2;
import java.util.*;
public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] price = new int [n];
	    for (int i = 0; i < price.length; i++) {
			price[i] =sc.nextInt();
		}
	    int q = sc.nextInt();
	    while(q-->0) { // q is no. of query...jaise likha hai usse Post increment...i.e...while(q>0)..niche q--;
	    	int A = sc.nextInt(); // paise kitne hai...
	    	int K = sc.nextInt(); // choice kitne hai..
	    	if(isPossible(price, A, K)==true) {
	    		System.out.println("Yes");
	    	}
	    	else {
	    		System.out.println("No");
	    	}
	    }
		}
		public static boolean isPossible(int [] price, int A, int k) { // Function to chech whether she can purchase or not
			int count =0; // count to check kha-kha kharch kar skti hai...
			for (int i = 0; i < price.length; i++) {
				if(A%price[i]==0) {  // ex: 500%400 is not equal to 0 so she can't buy that item...
					count++;
				}
			}
			if(count>=k) { // Atleast bola tha question m...to usse jyada pe bhi chalega
				return true;
			}
			else {
				return false;
			}
		}

	}
