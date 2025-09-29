package Lecture22;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 3;
    CoinToss(n, "");
	}
    public static void CoinToss (int n, String ans) { //ek n ki value, 1 ans wala string bhejenge
    	if(n==0) { //agr coin khtm to
    		System.out.println(ans);
    		return; //likhna hai wrna stack overflow
    	}
    	
    	CoinToss(n-1, ans + "H"); //agr head gya to 1 bacha. n-1....jo coin bach gya
    	CoinToss(n-1, ans + "T");
    }
}
