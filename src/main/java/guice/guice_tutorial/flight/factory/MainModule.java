package guice.guice_tutorial.flight.factory;

import com.google.inject.AbstractModule;

import guice.guice_tutorial.flight.module.ClientModule;

public class MainModule extends AbstractModule
{
	@Override
	protected void configure() {
		install(new ClientModule());
	}
}
