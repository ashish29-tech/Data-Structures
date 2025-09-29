package Lec15;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "hello";
    String str1 = "hello";
    String st = new String("hello");
    String st1 = new String("hello");
    	
    System.out.println(st1 == st); //aise class type ka chiz...ex: array,string,arraylist...==(double equal to) address compare karta hai
    
    System.out.println(st1.equals(st)); //.equals ek method hai ye content compare karega
    
    System.out.println(str == str1); // location same hai to true ayega
    
    System.out.println(str == st); // loaction alag hogi isliye false ayega
    String s1= "hell"; //niche o m add hua to ise garbage collector leke chala jayega
    s1 = s1 + "o"; //s1 pehle se bani hui hai uske baad usme o add hoga
    String s = "hell" + "o"; //pehle pura right hand side chalega..ikkhate dono ek sath banenge
    System.out.println(str==s);
	}

}
