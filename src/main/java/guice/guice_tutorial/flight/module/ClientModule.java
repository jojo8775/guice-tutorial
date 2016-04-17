package guice.guice_tutorial.flight.module;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import guice.guice_tutorial.flight.factory.SearchRequestFactory;

public class ClientModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		FactoryModuleBuilder fb = new FactoryModuleBuilder();
		install(fb.build(SearchRequestFactory.class));
	}
}
