package Lecture6;

public class Inverse_Of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 32145;
    int pos = 1; //index ke baad sbse pehle position 1 hai
    int ans = 0;
    while(n>0) {
    	int rem = n % 10;
    	//pow double type ki value return karta hai
    	//ans m jo kuch rakha hai usme 
    	ans = (int) (ans + pos*(Math.pow(10,rem-1))); // position * rem-1// int m typecast kar diya
    	n/=10; //no. ko chota kar rhe by 10
    	pos++; //agli baar next position ka no. lenge
    	
    }
    System.out.println(ans);
				
	}

}
