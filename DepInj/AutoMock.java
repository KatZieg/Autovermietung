package autovermietung;

public class AutoMock implements Iauto {

	@Override
	public double berechnePreis(double tagespreis, double rabatt) {
		
		return 180;
	}

}
