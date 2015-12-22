package depinjAutovermietung;

import com.google.inject.Binder;

import com.google.inject.Module;

public class KundeModule implements Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(Iauto.class).to(Auto.class);
	}
}
