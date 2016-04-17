package guice.guice_tutorial.project;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SomeDelegate
{
	@Inject
	private SomeFactory factory;

	public void processSomething(Injector injector)
	{
		SomeHelper helper1 = injector.getInstance(SomeHelper.class);
		helper1.print();

		SomeHelper2 helper2 = factory.createSomeHelper2("prodution msg 1", "production msg 2");
		helper2.print();
	}
}
