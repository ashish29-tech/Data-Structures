package Lecture20;

public class Fact_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n =5;
    System.out.println(fact(n)); //funtion call
	}
    
	public static int fact(int n) { //n ka hame ans inkalna tha
		//base case...jha pe recursion rokna hai
		if(n==1) {
			return 1;
		}
		//small problem
		int fn= fact(n-1); //recursion wiil give n-1...sp(small problem). This is recursive call
		return fn*n; //jo recursion de dega usme ham n multiply kar denge
	}
}



//jvm sbse pehle main method ko laod karta hai stack memory...function banta hai
//jab-jab function call hota hai tab tab new frame generate hota hai