package Lecture6;
import java.util.*;
public class Shopping_Game_HBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-->0) {
    	int AayushLimit = sc.nextInt();
    	int HarshLimit = sc.nextInt();
    	int CurrentAmount = 1;
    	int AayushPhones = 0;
    	int HarshitPhones = 0;
    	while(true) {
    		AayushPhones += CurrentAmount;
    		CurrentAmount++;
    		if (AayushPhones > AayushLimit) {
    			
    			System.out.println("Harshit");
    			break;
    		}
    		HarshitPhones += CurrentAmount;
    		CurrentAmount++;
    		if(HarshitPhones >HarshLimit) {
    			System.out.println("Aayush");
    			break;
    		}
    	}
    }
	}

}
