package guice.guice_tutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import junit.framework.TestCase;

@RunWith(PowerMockRunner.class)
@PrepareForTest({A.class, B.class}) 
public class MTest extends power
{
	@Test
	public void test()
	{
		Injector i = Guice.createInjector(new AbstractModule()
		{
			@Override
			protected void configure()
			{
				A a = Mockito.mock(A.class);
				Mockito.when(a.text()).thenReturn("THIS IS MOCKED!!");
				
				 bind(A.class).toInstance(a);
			}
		});
		
		M.blaa(i);
	}

//	private static class aa implements BI
//	{
//		public String text()
//		{
//			return "this is from mock class";
//		}
//	}
}
