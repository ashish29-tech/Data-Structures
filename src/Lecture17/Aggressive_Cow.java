package Lecture17;
import java.util.*;
public class Aggressive_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0) { //multiple test casesd hai isliye hai loop lelete hai..jisme sara input lenge
    	int nos = sc.nextInt(); //stall input
    	int noc = sc.nextInt(); // cow input
    	int [] stall = new int [nos]; //n stall hai isliye array bna lete hai..input le lete hai
    	for (int i = 0; i < stall.length; i++) {
			stall[i]= sc.nextInt(); //input liya
		}
    	
    	Arrays.sort(stall); //array ko sort karne ke liye
    }
	}
    public static int LargestMinDistance(int[] stall, int noc) { //kitne stall hai..and kitne cow hai wo bhej dete hai
    	int lo=0;
    	int hi= stall[stall.length-1] - stall[0]; //stall ke last index ki value..9-1...8 would be our hi
    	int ans=0; 
    	while(lo<=hi) {
    		int mid = (lo+hi)/2;
    		if(isitpossible(stall, mid, noc)==true) { //ek function..isitpossible..jitna stall hai..mid distance hai..to kya ham cow bitha pa rhe hai
    			ans=mid; // bitha pa rhe hai to ans yhi ho jayega
    			lo=mid+1; //maximize karna hai isliye 1 aage check karenge	
    		}
    		else {
    			hi=mid-1; //if bithana possible nai hota to..range chota karenge 
    		}
    	}
    	return ans;
    }
    public static boolean isitpossible(int[] stall, int mid, int noc) { //jo bhi mid aa rha hai uspe sari cows ko place kar pana possible hai ya nai 
    	int cows =1; //count of cow
    	int position=stall[0];
    	int i=1;
    	while(i<stall.length) { //0 pe bitha diya ab aage 1 se last tak check karna hai isliye loop
    		if(stall[i]-position>=mid) { //stall[i]..kons position pe hai...minus..last time kha bithae the..inke beech ka distance greater than mid hua to 1 aur cow bitha skte hai
    			cows++;
    			position=stall[i]; //last time kha baitha tha uske sath compare karenge..isliye position update kar di..to position current wala ho jayega
    		}
    		if(cows==noc) { //agr sara bithana possible hua to
    			return true; //possible hai to
    		}
    		i++;
    	}
    	return false;
    }
}
