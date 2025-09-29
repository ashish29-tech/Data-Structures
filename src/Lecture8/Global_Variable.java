package Lecture8;

public class Global_Variable { //EK aisa variable jise har koi access kar ske..
//Us function ke variable ko bolte hai local variable
	static int val = 100; //class ke andar...method ke bhr banana hota hai global var. Heap m banega
	//static int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//val = 50; //upar val declare kar diya...line no. 6
    System.out.println("Hey");
    int x = 90;
    System.out.println(val);
    fun(x); //fun method ko call kiya. x m value paas karte hai
    System.out.println(val);
	}
    public static void fun(int x) { //int x bhej diya
    	int a = 90;
    	System.out.println(x);
//    	int val = 19; //local create kar diya to
//    	System.out.println(val); //local ko prefernce milegi
    	
    	
    	//val = 120; heap m update kar dega and set kar dega 120 cuz heap m changes persist karta hai

    	System.out.println(val);
    }
    
    public static void fun1(int x) {
    	int a2 = 80;
    	System.out.println(x);
    }
}
//local and global conflict m...local ko prefernce denge.

//Final variable...constant hota hai..jiski val dobara 
//change nai kar skte. Means no re-initialisation