package autovermietung;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import junit.framework.Assert;

public class KundeTest {

	@Test
	public void testBuchen() {
		Injector i=Guice.createInjector();
		Kunde kurti=i.getInstance(Kunde.class);
		Assert.assertEquals(180.00, kurti.buchen(3));
	}

}
