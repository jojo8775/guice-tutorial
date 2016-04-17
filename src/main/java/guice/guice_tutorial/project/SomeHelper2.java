package guice.guice_tutorial.project;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class SomeHelper2 implements A
{
	private final String msg;
	
	@Inject
	public SomeHelper2(@Assisted String msg){
		this.msg = msg;
	}
	
	public void print(){
		System.out.println(msg);
	}
}
