package guice.guice_tutorial.project;

import com.google.inject.assistedinject.Assisted;

public interface SomeFactory
{
	public SomeHelper2 createSomeHelper2(@Assisted("msg1") String msg1, @Assisted("msg2") String msg2);
}
