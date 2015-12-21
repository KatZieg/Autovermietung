package autovermietung;


public class Auto implements Iauto{
	
	String typ;
	String model;
	String reifenArt;
	
	double preis;
	double tagespreis; //100.00
	double rabatt; //10%
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
	
	public double berechneRabatt(double tagespreis){
		rabatt=0.1*tagespreis;
		return rabatt;
	}
	public double berechnePreis(double tagespreis, double rabatt){
		preis=tagespreis*rabatt;
		return preis;
	}

}
