package depinjAutovermietung;

public class AutoMock implements Iauto {

	@Override
	public double berechneRabatt(double tagespreis) {

		return 180;
	}
}
