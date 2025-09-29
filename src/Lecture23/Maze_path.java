package Lecture23;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4*5 four cross five ka matrix
      int m = 3;
      int n = 3;
      Printpath(m-1, n-1, 0,0, ""); //agr m*n ka matrix hai to last cell m-1, n-1 hoga. Start karene 0,0 se. Aur ek string bhej denge khali answer ke lie.
	}
    public static void Printpath (int er, int ec, int cr, int cc, String ans) {  //void cuz hame print karna hai. End Row, Column, Current Row & Column
    	if(cc==ec && cr==er) { //base case
    		System.out.print(ans+ " ");
    		return; 
    	}
    	if(cc>ec || cr>er) { //ek base case jab ham dimension se bhr hat rhe hai to in dono m se kisi case m
    		return; //normal return kar denge
    	}
 	
    	 Printpath(er, ec, cr, cc+1, ans+"H"); //cc(Horizontal ka call) mae +1 karenge to answer m Horizontal add kar denge
    	 Printpath(er, ec, cr+1, cc, ans+"V"); //if vertical call then add V
  	 
    	 
    }
}
