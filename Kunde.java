package autovermietung;

import java.util.Set;
//CalcSteuer

import autovermietung.Person;;
//Krk
public class Kunde {
	int id=22;
	int rabatt;
	
/*	public int KundenAnfrage(Kunde id){
		Auto a=new Auto();
		return a.preis & a.ps;
	}
	public int KundenRabatt(Kunde id){
		int rabatt=20;
		return rabatt;
	}
*/	
	public Auto porsche;
	
	public Kunde(Auto thisPorsche){
		porsche=thisPorsche;
	}
	
	
	 //Buchung, nimmt Auto und gibt KundenID zurück
	 public int buchen(Auto auto){
			//Auto porsche= new Auto(); //Autos stecken in Datenbank, böse Abhängigkeit!!!!  thisPorsche !!
			if(porsche.getVermietet()==false){     //prüft ob das Auto frei ist, false=frei, true=vermietet
				porsche.vermietet =true;  // reservieren
				porsche.kundenID=id;  //KundenID an das Auto haften
				System.out.println("Porsche hat nun die kundenId " +porsche.kundenID);
			}else{
				System.out.println("Das Auto ist leider nicht frei!");
			}
		 return id;  //Das will ich testen!!
		}
	
	
}
