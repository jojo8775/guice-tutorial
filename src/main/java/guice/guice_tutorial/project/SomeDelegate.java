package guice.guice_tutorial.project;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SomeDelegate
{
	public void processSomething(Injector injector){
		SomeHelper helper1 = injector.getInstance(SomeHelper.class);
		helper1.print();
		
//		A helper2 = injector.getInstance(SomeFactory.class).createSomeHelper2("Some production text");
//		helper2.print();
	}
}
