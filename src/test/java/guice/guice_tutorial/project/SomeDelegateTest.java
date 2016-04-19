package guice.guice_tutorial.project;

import java.util.List;

import org.junit.Test;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import com.google.inject.assistedinject.FactoryModuleBuilder;

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
				binder.install(new FactoryModuleBuilder().implement(SomeHelper2.class, MockSomeHelper2.class)
						.implement(SomeHelper3.class, MockSampleHelper3.class)
						.implement(SomeHelper4.class, MockSomeHelper4.class).build(SomeFactory.class));
			}
		});

		SomeDelegate someDelegate = injector.getInstance(SomeDelegate.class);
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
		@AssistedInject
		public MockSomeHelper2(@Assisted("msg1") String msg1, @Assisted("msg2") String msg2)
		{
			super(msg1, msg2);
		}

		@Override
		public void print()
		{
			System.out.println("This is constructor injection");
		}
	}

	private static class MockSampleHelper3 extends SomeHelper3
	{
		private List<String> msgList;

		@AssistedInject
		public MockSampleHelper3(@Assisted List<String> msgList)
		{
			super(msgList);
			this.msgList = msgList;
		}

		@Override
		public void print()
		{
			System.out.println("This is mock list");
			
			for(String s : msgList){
				System.out.print(s + ",  ");
			}
			
			System.out.println("end of mock");
		}
	}

	private static class MockSomeHelper4 extends SomeHelper4
	{
		private SomeModel criteria;
		
		@AssistedInject
		public MockSomeHelper4(@Assisted SomeModel criteria)
		{
			super(criteria);
			this.criteria = criteria;
		}
		
		public void print(){
			System.out.println("Helper 4 mock beg: ");
			System.out.println(criteria.getName());
			System.out.println("Helper 4 mock end:");
		}
	}
}
