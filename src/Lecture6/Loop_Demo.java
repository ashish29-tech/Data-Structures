package Lecture6;

public class Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte ka range -128 to 127 hota hai
		// b =(byte) 128;
		// System.out.println(b); //-128
		for (byte b = 0; b <= 128; b++) { //b++; b = (byte) (b+1);
			System.out.println(b); //0-127 tak shi chalga uske baad...128 hote hi internally typecast ho jayega and -128 ban jayega. That's why infinite loop
		}
			
		for (byte b1 = 0; b1 < 128; b1++) {
			System.out.println(b1);			
		}
		
		for (byte b2 = 0; b2 < 127; b2++) { //126 tak chalega uske baad condition false
			System.out.println(b2);			
		}
		
		
		byte a = 8;
		byte b = 9;
		byte c = (byte) (a+b);
		System.out.println(c);
	}

}
