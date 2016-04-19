package guice.guice_tutorial.project;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class SomeHelper4
{
	private final SomeModel criteria;

	@AssistedInject
	public SomeHelper4(@Assisted SomeModel criteria)
	{
		this.criteria = criteria;
	}

	public void print()
	{
		System.out.println(criteria.getName());
	}
}
