package Lec16;

public class Finding_CB_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "81615";
    //PrintSubstring(str); //call kar diya printsubstring ko...susbstring generate ho jayega
    System.out.println(PrintSubstring(str));
	}
    public static int PrintSubstring(String str) {
    	int count =0; //cb no. hai to count kar lenge
    	boolean [] visited = new boolean [str.length()]; //boolean array bna liya jitne length ka hai utne length ka
      for (int len = 1; len < str.length(); len++) { //kitne length ka generate karna hai...loop fix kar diya jitne length ka ho wha tak jaye...1-6..
		for (int si = 0; si <=str.length()-len; si++) { //start ka loop...0 se start karna hai le
			int ei= si + len; //ei-si=len
			String s= str.substring(si,ei); //jo bhi substring nikal rhe hai..use no. m convert kar ke check karenge..ki wo cb no. hai ya nai
		
//			Integer.parseInt(s); //string se integer convert
//			Long.parseLong(s); //string to long
			
			if(iscbnumber(Long.parseLong(s))==true && isvisited(visited, si, ei-1)==false) { //17 didgit no. ko long m convert kia..and true hai to...visited function bheja
				//visited marked
				for (int i = si; i < ei-1; i++) {
					visited[i]=true;
				}
				count++;
			}
		}
		
	}
      return count; 
    }
    public static boolean isvisited(boolean[] visited,int si, int ei) {
    	
    	for (int i = si; i<=ei; i++) { //
			if(visited[i]==true) { //already visited hai...true likha hua hai/ true set hai to
				 return true; //ye cb no. nai hai
			}
		}
    	return false; //pura loop chal jai..true set nai hai to cb no. hai
    	
    }
    public static boolean iscbnumber(long n) { //17 didgit ka constraint isliye long..
    	int [] arr = {2,3,5,7,11,13,17,19,23,29}; //array m le liya cb num
    	if(n==0 || n==1) { //1-1 kar ke check karenge criteria mentioned in question
    		return false;
    	}
    	for (int i = 0; i < arr.length; i++) { //2,3,5,7,11,13,17,19,23,29
			if(arr [i]==n) {
				return true;
			}
		}
    	for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]==0) { //upar ke criteria..2,3,5,7,11,13,17,19,23,29..inme se kisi se bhi divisible ho gya..
				return false;
			}
		}
    	return true;
}
}
