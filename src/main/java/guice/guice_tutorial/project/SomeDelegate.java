package guice.guice_tutorial.project;

import java.util.Arrays;

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
		
		SomeHelper3 helper3 = factory.createSomeHelper3(Arrays.asList("msg 1, msh2"));
		helper3.print();
		
		SomeModel model = new SomeModel.Builder().name("Jeebs in prod").build();
		SomeHelper4 helper4 = factory.createSomeHelper4(model);
		helper4.print();
	}
}
