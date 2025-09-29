package Lecture18;
import java.util.*; // is package ke sare class use kar skte hai
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list= new ArrayList<>(); //List naam ka variable bnaya...Integer ArrayList data type ka. Memory allocate hoga and heap ke andar ek khali list ban jayegi
		//ArrayList<Long> list; //Long type ka...primitive nai likhenge...only wrapper class..koi bhi classs ka ya user defined like Student type ka bhi chal jayega
		System.out.println(list); // heap ke andar ek khali list ban jayegi
		
		//Add...last m add karega
		list.add(10); //variable ke name ke aage .add(function)...list m 10 add ho jayega...[10]
		list.add(20); //20...10 ke peeche alg jayega...[10, 20]
		System.out.println(list); //list print kar ke dekh skte hai
		
		
		//Add at index
		//range pass karenge...0 se size(zero to size)
		list.add(0, 30); // 30 pehle aa jayega baki peeche chale jayga...0th(zeroth index0 pe 30.
		System.out.println(list);
		
		list.add(2, 30); //0 & 1 index ke peeche mtlb [10, 20, 30]
		System.out.println(list);
		
		
		System.out.println(list.size()); // list ka size..kitne element list m add hai
		
		//Capacity: kitna rakhte hai....jitna add kiya utna size hota hai
		//Size nai pta hoga to arraylist...pta hoga to array use
		
		
		//delete...range: 0 to size-1
		System.out.println(list.remove(1)); // 1 se data remove ho jayega
		System.out.println(list); //10 remove ho jayega....baki sb aage shift ho jayenge...[30,10,30,20]....[30,30,20]
		
		
		//Get function. Range: 0 to size-1
		System.out.println(list.get(2));
		System.out.println(list); // remove nai karega..value nikal ke de dega
		
		
		//To update value we'll use Set Method/Function. Set function update karta hai index pe jake
		list.set(1, -5); //
		System.out.println(list);
		for(int i = 0; i<list.size(); i++) { //ek-ek value nikal ke//Arraylist ko print krne ke liye loop...
		  System.out.print(list.get(i)+ " "); //1-1 element print ho jayega. Get finction hai yhape
		}
		System.out.println();
		
		for(int i = list.size()-1; i>= 0; i-- ) { //reverse order m print kar dega
		  System.out.print(list.get(i)+ " ");
		}
		
		
		//Enhanced for loop...forward chalta hai...reverse nai
		for(int val: list) { // kis variable(array, map etc) pe loop lagana hai..is case m list. Value kis type ka hai..integer type ka hai to int
			System.out.print(val+ " "); //ye direct value read karta hai..index read nai karta
		}
		System.out.println();
		
		int [] arr = {10, 20, 30};
		for(int val : arr) {
			System.out.print(val+ " "); //index pe jake value read karega
		}
		System.out.println();
		
		
		//2D Array print through Enhanced for loop. 2D array is a collection of 1D Array
		int [] [] a = new int [2] [3]; // 2 array create hoga...3-3 size ka
		for(int [] a1 : a) {  //1-1 kar ke 1D array access karenge
		  for(int i:a1)  { //us 1D array pe enhanced for loop lagayenge
			  System.out.println(i);
			  
			  //Array.sort(arr)
			  Collections.sort(list); //ArrayList ko sort kar dega. Collection is a class..java m bani banai. Is class m sort function likha hua hai
		  }
		}
	}

}
