package autovermietung;

import com.google.inject.ImplementedBy;

@ImplementedBy (KundeModule.class)

public interface Iauto {
	public double berechnePreis(double tagespreis, double rabatt);
}
