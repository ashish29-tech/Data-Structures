package Lecture22;

public class Coin_Toss_Without2Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 3;
    CoinToss(n, "");
	}
    public static void CoinToss(int n, String ans) {
    	if (n==0) {
    		System.out.println(ans);
    		return;
    	}
    	// || or ke case m 1st condition shi hai to dusra check nai hoga...1st galat hoga to dusra check hoga
    	// && and ke case m..1st galat hai to dusra check nai karte..1st shi hai tab dusra check karte hai
    	if(ans.length()==0 || ans.charAt(ans.length()-1) !='H') { //string khali hai tab call ajye ya last char H hai to call na jaye
    	CoinToss(n-1, ans + "H");
    	}
    	CoinToss(n-1, ans + "T");
    }
}
