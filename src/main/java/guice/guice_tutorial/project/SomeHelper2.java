package guice.guice_tutorial.project;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class SomeHelper2 
{
	private final String msg1;
	private final String msg2;
	
	@AssistedInject
	public SomeHelper2(@Assisted("msg1") String msg1, @Assisted("msg2") String msg2){
		this.msg1 = msg1;
		this.msg2 = msg2;
	}
	
	public void print(){
		System.out.println(msg1);
		System.out.println(msg2);
	}
}
