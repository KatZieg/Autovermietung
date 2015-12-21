package depinjAutovermietung;

import com.google.inject.ImplementedBy;

@ImplementedBy(KundeModule.class)

public interface Iauto {
	public double berechneRabatt(double tagespreis);
}
