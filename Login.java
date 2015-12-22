package autovermietung;

public class Login {
	int id;

	public void setId() {
		id = (int) Math.random() * 10; // jede Instanz von Kunde hat eine eigene
										// konstante ID
	}

	public int getId() {
		return id;
	}

	public int anmelden(String username) {
		return id;
	}
}
