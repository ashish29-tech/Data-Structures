package DoubtClass_4;
import java.util.*;
public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(sumofdigit(n)==BostonNum(n)) {
    	System.out.println(1);
    }
    else {
    	System.out.println(0);
    }
	}
	// prime factor calculate karenge
	public static int BostonNum(int n) {
		int primefact=0;
		for (int i = 2; i <=n; i++) { //kisi bhi no. ka prime factor 2 se start hota hai...2 is less than 378
			
			while(n%i==0) { //jab tak mera no. i se divible hai tab tak divide karte jayenge.....i prime factor hai. 2%378 i==0....3%189==0
				primefact = primefact + sumofdigit(i); //is prime factor m i ko add karna hai....1st time 2 add ho gya...2nd time 3 add
				n/=i; // first time 189 ho gya
			}
		}
		return primefact;
	}
	
	
	
	// sabse pehle sum of digits ka code likhenge
	public static int sumofdigit(int n) {
		int sum=0;
		while(n>0) { //jab tak no. 0 na ho
			int rem=n%10; //remainder nikalege
			sum=sum+rem; //rem ko sum m add kar denge
			n=n/10;
		}
		return sum;
	}

}
