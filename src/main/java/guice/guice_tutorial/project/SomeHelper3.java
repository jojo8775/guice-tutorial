package guice.guice_tutorial.project;

import java.util.List;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class SomeHelper3
{
	private final List<String> msgList;
	
	@AssistedInject
	public SomeHelper3(@Assisted List<String> msgList)
	{
		this.msgList = msgList;
	}
	
	public void print(){
		for (String s : msgList)
		{
			System.out.println(s);
		}
	}
}
