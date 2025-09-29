package Lecture18;
import java.util.*;
public class ArrayList_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ll = new ArrayList<>(); //ArrayList bna liya integer type ka. ll naam de diya
    for (int i = 0; i < 4; i++) { //Array m 4 input...to 4 baar chalega
		ll.add(sc.nextInt());// 1-1 kar ke jo input ayega use add wale m bhej dega...10(input denge) read karega add function m chale jayega..203...then 40..
	}
		for (int i = 0; i < ll.size(); i++) { //for printing
			System.out.println(ll.get(i));
		}
	}

}
