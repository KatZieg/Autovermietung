package autovermietung;
import autovermietung.Login;

public class Person {

	int id;
	String name;
	String adresse;
	char f�hrerscheinklasse;
	
	public  int idVergabe(){
	Login login=new Login();
	id=login.getId();  //Login vergibt die Id an die jeweilige Person
	System.out.println("Die id f�r den Kunden ist: " + id);
	return id;
	
	}
}
