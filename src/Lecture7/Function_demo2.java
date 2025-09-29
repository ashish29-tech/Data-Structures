package Lecture7;

public class Function_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hey");
    
    System.out.println(addtwonumber()); //direct syso m addtwonum ko call kar liya
    
    // addtwonumber();
//    int c = addtwonumber();//ya phir kisi val m capture kara ke print....line 9
//    System.out.println(c);
    System.out.println("Bye");
	}
	
	public static int addtwonumber() { // return type changed to int from void....jab stack ude to apne sath ek value lekar jaye print na kare
		int a = 7;
		int b = 11;
		int c = a + b;
//		System.out.println(c);
		return c; //jo bhi c m pda hoga wo return kara denge
	}

}
