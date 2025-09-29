package Lecture4;

public class Post_and_Pre_Opertr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 9;
    a++;// a+1;
    System.out.println(a);
    a++; //11
    System.out.println(a++);//12. Post-Increment: pehle a print hoga uske baad a m change ayega
    System.out.println(a);//12
    System.out.println(++a);//13
    int b = a++; // 14....pehle a ka value assign kar de b m..uske baad a m change hoga
    
    int c = a++ - 9;
    System.out.println(c); //14-9
	}

}
