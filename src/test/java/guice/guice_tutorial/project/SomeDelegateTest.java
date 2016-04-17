package guice.guice_tutorial.project;

import org.junit.Test;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class SomeDelegateTest
{
	@Test
	public void testProcessSomething()
	{
		Injector injector = Guice.createInjector(new Module()
		{
			public void configure(Binder binder)
			{
				binder.bind(SomeHelper.class).to(MockSomeHelper.class);
				binder.bind(SomeHelper2.class).to(MockSomeHelper2.class);
			}
		});

		SomeDelegate someDelegate = new SomeDelegate();
		someDelegate.processSomething(injector);
	}

	private static class MockSomeHelper extends SomeHelper
	{
		@Override
		public void print()
		{
			System.out.println("this is the test implementation.");
		}
	}

	private static class MockSomeHelper2 extends SomeHelper2
	{
		public MockSomeHelper2(String msg)
		{
			super(msg);
		}
		
		@Override
		public void print(){
			System.out.println("This is constructor injection");
		}
	}
}
