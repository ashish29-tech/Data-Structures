package Lecture17;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] pages = {10, 20, 30, 40}; //hardcore input kar diya
    int nos = 2; //nos kitne hai
    // no need to sort array as it is in ascending order
    System.out.println(minimumpages(pages, nos));
	}

	public static int minimumpages(int [] pages, int nos ) { //pages wala array bhej denge and student kitne hai
		int lo=0; //1st student won't read a single page
		int hi=0;
		for (int i = 0; i < pages.length; i++) { //array pe for loop
			hi= hi+pages[i]; // array ka sum le liya hi m. hi m array of i add kar diya..taki wo sara read karega
			
		}
		int ans=0;
		while(lo<= hi) {
			int mid= (lo+hi)/2;
			if(isitpossible(pages, mid, nos)==true) {
				ans=mid; //ans yaad kar liya
				hi= mid-1;
			}
			else {
				lo=mid+1;// possible nai tha to mid badhana tha
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] pages, int mid, int nos ) {
		int student=1; //1st student hai
		int read_page=0; // shuru m 0 page read hai
		int i = 0;
		while(i<pages.length) { //sare ke sare books read karane hai
			if(read_page + pages[i]<=mid) { //pehele se kitna read kiya hai + current value
				read_page+=pages[i]; //kam hai to read kara denge
				i++;
			}
			else { //agr limit cross kar rha hai
				student++; //to 2nd student ko bulayenge
				read_page=0; //iska initial read_page 0 kar denge
			}
		}
		if(student>nos) { //student jyada lage to
			  return false;
		}
		return true; //wrna return true
	}
	
}
