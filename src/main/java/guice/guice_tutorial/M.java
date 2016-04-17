package guice.guice_tutorial;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import guice.guice_tutorial.project.SomeDelegate;
import guice.guice_tutorial.project.SomeFactory;
import guice.guice_tutorial.project.SomeModule;

public class M
{
	public static void main(String[] args)
	{
//		Injector injector = Guice.createInjector(new SomeModule());
		Injector injector = Guice.createInjector(new Module()
		{
			public void configure(Binder binder)
			{
				binder.install(new FactoryModuleBuilder().build(SomeFactory.class));
			}
		});
		SomeDelegate someDelegate = injector.getInstance(SomeDelegate.class);
		someDelegate.processSomething(injector);
	}
}
