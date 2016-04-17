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
//		Injector injector = Guice.createInjector(new ModuleA());
//		blaa(injector);
//		A a = new A();
//		a.print();
		
		Injector injector = Guice.createInjector(new SomeModule());
		
		SomeDelegate someDelegate = new SomeDelegate();
		someDelegate.processSomething(injector);
	}
	
	public static void blaa(Injector injector){
		
		A a = injector.getInstance(A.class);
		a.print();
		System.out.println(a.text());
	}
}
