/**
 * 
 */
package autovermietung;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import MockDEMO.CalcSteuer;
import MockDEMO.Krk;

public class AutovermietungTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() { 
		//der Aufruf der Methode buchen geschieht in Abhängigkeit von Auto
		//da die Autos aus der Fahrzeugdatenbank ausgelesen werden sollen
		//verwende ich einen Mock für das Auto
		Kunde kurt = mock (Kunde.class); // genial
		when(kurt.buchen(kurt.id)).thenReturn();
		Auto porsche = new Auto(mockCar);
		assertEquals(, k.calcBeitrag(5000));
	}
}
