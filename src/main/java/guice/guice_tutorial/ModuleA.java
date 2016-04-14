package guice.guice_tutorial;

import com.google.inject.Binder;
import com.google.inject.Module;

public class ModuleA implements Module
{
	public void configure(Binder binder)
	{
		binder.bind(A.class);
	}
}
