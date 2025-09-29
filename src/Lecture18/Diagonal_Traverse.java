package Lecture18;
import java.util.ArrayList;
import java.util.Collections;
public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int[] findDiagonalOrder(int[][] mat) { //sare element ko 1D array m return kar ke rakhna hai
        int n = mat.length;
        int m = mat[0].length; // Column length
        int [] ans = new int [n*m]; //1D array bna liya..ans array...sare diagonal ke sare element ko array m bhar ke return karna hai..isliye n*m size ka.
        int i = 0; // kis index pe rakhna hai yaad kar lete hai
    	for (int d = 0; d < n+m-1; d++) { //Jitne diagonal utne pe loop. If n*m matrix then no. of diagonal would be n+m-1. 
			int r =0;
			int c = 0;
    		if(d<m) { //diagonal is less than column
    			r = 0; // toh row 0 pe rahe....0,0 0,1 0,2
    			c = d; //Jo diagonal hoga wahi column hoga....column kha se start ho rha hai...jha se diagonal start ho rha
    		}
    		else {
    			r = d-m+1;
    			c = m-1; //column m-1...1,5...2,5...3,5
    		}
    		ArrayList<Integer> list = new ArrayList<>(); // 1 diagonal ka list/element rakha hai...isi ko utha ke 1D array m rakhna hai
    		while (r<n && c>=0) { //row range m ho..row m increment ho rha tha..n se bda nai hona chahiye...column kam kar rhe hai....&& lagega cuz dono range m honge tbi kaam hoga
    			list.add(mat[r] [c]);
    			r++; //row ko 1 se bda diya
    			c--; 	
    		}
    		if(d%2==0) { //jab diagonal even hai to us case m arraylist ko reverse kar denge...toh original jaisa mail jayega...cuz abi tak ham sidha-sidha add kar rhe the
    			Collections.reverse(list); //reverse kar ke de dega
    		}
    		for(int val : list) { //Upar wali arraylist pe loop
    			ans[i]= val; //ans ke index i pe val ko add kar
    			i++; 
    		}
		}
    	return ans;
    }

}
