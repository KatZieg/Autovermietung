package depinjAutovermietung;

import java.util.Set;
import com.google.inject.Inject;

public class Kunde extends Person {
	int id = 22;
	int anzahlTage;

	private final Iauto autointerface;

	@Inject
	public Kunde(Auto aauto) {
		autointerface = aauto;
	}

	/*
	 * public int KundenAnfrage(Kunde id){ Auto a=new Auto(); return a.preis &
	 * a.ps; } public int KundenRabatt(Kunde id){ int rabatt=20; return rabatt;
	 * }
	 */
	public Auto porsche;

	// public Kunde(Auto thisPorsche){
	// porsche=thisPorsche;
	// }

	// Buchung, nimmt Auto und gibt KundenID zurück
	public double buchen(double tagespreis, int anzahlTage) {
		// Auto porsche= new Auto(); //
		/*
		 * if(porsche.getVermietet()==false){ //prüft ob das Auto frei ist,
		 * false=frei, true=vermietet porsche.vermietet =true; // reservieren
		 * porsche.kundenID=id; //KundenID an das Auto haften
		 * System.out.println("Porsche hat nun die kundenId "
		 * +porsche.kundenID); }else{ System.out.println(
		 * "Das Auto ist leider nicht frei!"); } return id;
		 */

		double gesamtPreis = tagespreis * anzahlTage - autointerface.berechneRabatt(tagespreis) ;
		return gesamtPreis;
	}
}
