package Lecture7;

public class function_demo {

	public static void main(String[] args) { // main method ka name hai
		// TODO Auto-generated method stub
    System.out.println("Hey");
    addtwonumber();
    System.out.println("Bye");
	}
	
	public static void addtwonumber() { // void matlab kuch return nai karega.....addtwonumber is a function name
		int a = 9;
		int b = 11;
		int c = a + b;
		Subtwonumber(); //Subtwonumber ko call kar diya
		System.out.println(c);
		return; //No need bcoz kaam hote hi a=ud jata hai. Simply return kuch leke nai jayega
	}
	
	public static void Subtwonumber() { //yha koi parameter/argument ham nai de rhe hai....mtlb non-parameterised
		int a = 9;
		int b = 11;
		int c = a - b;
		System.out.println(c);
	}
	

}
