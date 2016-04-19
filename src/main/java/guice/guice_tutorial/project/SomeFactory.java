package guice.guice_tutorial.project;

import java.util.List;

import com.google.inject.assistedinject.Assisted;

public interface SomeFactory
{
	SomeHelper2 createSomeHelper2(@Assisted("msg1") String msg1, @Assisted("msg2") String msg2);
	
	SomeHelper3 createSomeHelper3(@Assisted List<String> msgList);
}