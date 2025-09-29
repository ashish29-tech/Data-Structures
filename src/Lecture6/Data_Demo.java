package Lecture6;

public class Data_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     byte b = 134; //Range se bhr hai.forcefully write 134 in byte
//		byte b = (byte) (134); //Typecasting kar ke isko range m laa diya
//     System.out.println(b);
		
		
//		byte b = 14; //no. range m hai isliye internal typecast
//		System.out.println(b);
//		int i = 300;
////		b = i; // b m i nai aa rha..32 bit ke size ko 8 bit m rakhna chah rhe hai.Isliye typecast karenge
//		b = (byte) i;
//		System.out.println(b);
//      b++;// (byte) (b+1); Internal Typecasting
		
		//Chote ko bade m rakh rhe hai. 8 bit ko 32 bit m rakh rhe hai
		//No need to typecast
//		int ii = 178;
//		byte b1 = 62;
//		ii = b1; //
//		System.out.println(ii); // no. change nai hoga
		
		
		// Chote no. ko bade m rakh rhe hai to change nai hoga
		int im = 178;
		byte b2 = -5;
		im = b2;
		System.out.println(im);
		
		long ll = 271675908; //10^9 10 ki power 9 se bda no. nai likh skte
		long ll2 = 2716759078l; //last m L lga diya to typecasr ho gya
		
		//float 32 bit
//		float f = 7.9; // hardcorded jo likha hai wo value double type ka hota hai isliye wrong
		float f1 = 7.9f; //float m lane ke liye. f likhne se typecast ho gya float m.
		
		//Double 64 bit
		double d = 67.9; 
		
		boolean bt = true;
		boolean bt1 = false;
		
		
	}

}
