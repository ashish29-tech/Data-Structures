package Lec16;

public class Substring_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="abcd";
   printSubstring(str); //call kar liya
		
	}
    public static void printSubstring(String str) {//isme string bhejenge aur use print karenge
    	//2 loop lagayenge aur sare substring method print karenge
    	for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) { //length string ke case m function hai 
				System.out.println(str.substring(i,j)); //i se j tak ka str.substring hi to print karna hai
			}
		}
    	
    	
    }
	
	}


