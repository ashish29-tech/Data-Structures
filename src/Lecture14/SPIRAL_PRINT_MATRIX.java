package Lecture14;

public class SPIRAL_PRINT_MATRIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][] arr = { {1,2,3,4}, 
    		         {5,6,7,8}, 
    		         {9,10,11,12}, 
    		         {13,14,15,16} };
    SpiralMatrix(arr);
	} 
    public static void SpiralMatrix (int [][] arr) {
    	int minr=0;
    	int maxr=arr.length-1;
    	int minc=0;
    	int maxc=arr[0].length-1;
    	int total=arr.length*arr[0].length; // total no. of element....row*column...16
    	int count = 0;
    	while(count<total) { //6,711,10 ke liye....12<16
    	for (int i = minc; i <=maxc && count<total; i++) { //loop on 0 row (1,2,3,4)
			System.out.print(arr[minr][i] + " "); //row fix hai...minC se maxC tak 
			count++; //jab-jab element ko print karenge count ko badha denge ham
		}
    	minr++;
    	for (int i = minr; i <= maxr && count<total; i++) { //loop to print 8,12,3
			System.out.print(arr[i][maxc] + " ");
			count++;
		}
    	maxc--;
    	for (int i = maxc; i >=minc && count<total; i--) { //4,9,21
			System.out.print(arr[maxr][i] + " ");
			count++;
		}
    	maxr--; //max r 21 se 9 pe phoch jayega
    	for (int i = maxr; i >=minr && count<total; i--) { //9,5
			System.out.print(arr[i][minc] + " "); // row vary kar rh ha...column fixed hai
			count++;
		}
    	minc++;
    	
    	}
    }
}
