package autovermietung;



//CalcSteuer
public class Auto {
	
	String typ;
	String model;
	String reifenArt;
	
	int preis;
	int ps;
	int kundenID;  //Kunde der das Auto gemietet hat
	
	boolean frei;
	boolean vermietet;
	
	public void setVermietet(){
		vermietet=false; //false= Auto ist frei, true =Auto ist vermietet
	}
	
	public boolean getVermietet(){ 
		return vermietet;
	}
	
	public int berID(int reihenfolge){
		int kundenID= reihenfolge*100;   //bäh
		return kundenID;
	}

}
