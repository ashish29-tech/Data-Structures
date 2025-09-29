package Lecture6;

public class Demo_Data_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char ch = 't'; // 9 //character ka length 1 hota hai, single quote m likhenge
    System.out.println(ch); //character print
    System.out.println((int)(ch)); //integral val ke liye typecast kar diya integer m
    
  //integer ko character m typecast
//    int i =788;
//    System.out.println((char)(i));
    
    
//    ch = ch + 1; //1 integer hai isliye error
    ch = (char) (ch+1); //character m typecast. ch ka ASCII val + 1
    char ch1= '4';
//    ch = ch + ch1; //Dono ASCII val hoga isliye tpecast karna padega
    System.out.println(ch + ch1); //As a ASCII value add hoga
    System.out.println(ch);
    ch++; //ch = (char) (ch+1); no error
    
    // 2 char ko add kare to uska ASCII val add hota hai
    
    // ch = 'i + 'u; Internal typecasting 
    
    
	}

}
