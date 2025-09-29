package Lecture11;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    System.out.println(RainWaterTrapping(arr));
	}
	public static int RainWaterTrapping(int [] arr) {
		
		int n = arr.length-1;
		int [] left = new int [n];
		int [] right = new int [n];
		left [0] = arr [0];
		for (int i = 0; i < right.length; i++) {
			
			left[i]= Math.max(left [i-1], arr[i]);
		}
		
		right[n-1] = arr[n-1]; //last index ka right....ka max khud hi banega
		for (int i = n-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1],arr[i]);
		}
		int ans=0;
		for (int i = 0; i < right.length; i++) {
			int min = Math.min(left[i], right[i]); // left ka max & right ka max m se min le rhe hai
			ans = ans + (min-arr[i]); // khud ka height min kar rhe hai....aur ans m add karte chal rhe hai
		}
		return ans;
	}

}
