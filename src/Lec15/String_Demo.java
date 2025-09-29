package Lec15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "hello"; //
    String str1 = "hello"; // upar aur yha dono jgah same address hai
    System.out.println(str); //address print nai hoga
    String st = new String("hello"); //jab string new kar ke crete hota hai to string pool m nai banega...pool ke bahar mgr heap ke andar banega
    String st1 = new String("hello");
    str = str + "bye";
    st1= st1 + "bye";
    System.out.println(str.length());
	}

}
