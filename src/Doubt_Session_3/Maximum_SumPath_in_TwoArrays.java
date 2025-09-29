package Doubt_Session_3;
import java.util.*;
public class Maximum_SumPath_in_TwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0) {
    	
    	
    	int n = sc.nextInt(); // n input liya
    	int m = sc.nextInt(); // m input liya
    	int [] arr = new int [n]; // array liya
    	int [] brr = new int [m]; // array liya
    	for (int i = 0; i < brr.length; i++) { // array input liya
			
    		arr[i] = sc.nextInt();
		}
    	for (int i = 0; i < brr.length; i++) { // array input liya
			brr[i]= sc.nextInt();
		}
    	System.out.println(pathSum(arr,brr)); //function call kiya
    }
}
	public static int pathSum(int [] arr, int [] brr) {//2 array le liya
		int i=0; //ye arr ka track rakhega
		int j=0; //ye brr ka track rakhega
		int p=0; //ye arr ka start batayega
		int q=0; //ye batayega brr ka start
		int ans =0; //ans le lenge jo ki hamara total sum yaad rakhega
		while(i<arr.length && j<brr.length) {
			if(arr[i]<brr[j]) {
				i++;
			}
			else if (arr[i]>brr[j]) {
				j++;
			}
			else {
				int sum1=0;
				int sum2=0;
				for (int k = p; k < i; k++) {
					sum1= sum1 + arr[k];
				}
				for (int k = q; k < j; k++) {
					sum2 += brr[k];
				}
				ans = ans + Math.max(sum1, sum2);
				i++;
				j++;
				p=i;
				q=j;
			}
		}
		
		
		if(i==arr.length) {  //arr.length is not euqal to i to ye loop nai chalega
			for (int k = 0; k < brr.length; k++) {
				ans = ans + brr[k];
			}
		}
		
		if (j==brr.length) { //ye barabar hai...
			for (int k = p; k < brr.length; k++) { //for loop chalayenge 
				ans = ans + arr[k];
			}
		}
		return ans;
	}
}
