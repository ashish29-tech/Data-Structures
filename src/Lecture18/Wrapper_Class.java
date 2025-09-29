package Lecture18;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class hai to memory allocation heap m hoga
		//Non primitive data types in java are a class 
		//Primitive stack m banta hai
    Integer a = 100;
    int a1 = 10;
    System.out.println(a);
    System.out.println(a1);
    Short s1 = 78; // Class
    //Byte b1 = 19; //Class
    
    
    System.out.println(s1);
    // System.out.println(b1);
    
    
    a = a1; // AutoBoxing: int(primitive) ko Integer(class) 
    System.out.println(a);
    Integer ii = 100;
    int i = 10;
    i = ii; // OnBoxing: Wrapper class to primitive
    System.out.println(i);
    
    
    //class like string, array, arraylist...type ki chize will always compare address
    //Integer, Byte(Isme duplicate nai banta), Short, Long...inme agr number -128 to 127 hua to duplicate  create nai hoga if bhr gya range se to create hoga
    
   // Cache(koi chiz yaad kar ke ya store kar ke rakhna) Heap memory m hoga
    Integer b1 = 19;
    Integer b2 = 19;
    System.out.println(b1==b2); //True becoz od integer cache..-128 to 127 hai to duplicate create nahi hone dega..and same address point karega. Duplicate nai create ho rha isliye address compare kar rha hai 
    Integer c1 = 190; //range ke bhr hai isliye ye kahi 2k pe create hoga
    Integer c2 = 190; // and ye kahi 4k pe
    System.out.println(c1==c2); // Range se bhr hai isliye false. 
    
    
	}

}
