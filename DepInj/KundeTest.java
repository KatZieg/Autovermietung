package depinjAutovermietung;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class KundeTest {

	@Test
	public void testBuchen() {
		Injector i = Guice.createInjector();
		Kunde kurti = i.getInstance(Kunde.class);
		Assert.assertEquals(70.00, kurti.buchen(100.00, 3));
	}

}
