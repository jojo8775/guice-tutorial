package guice.guice_tutorial;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class M
{
	public static void main(String[] args)
	{
		Injector injector = Guice.createInjector(new ModuleA());
		blaa(injector);
//		A a = new A();
//		a.print();
	}
	
	public static void blaa(Injector injector){
		
		A a = injector.getInstance(A.class);
		a.print();
		System.out.println(a.text());
	}
}
