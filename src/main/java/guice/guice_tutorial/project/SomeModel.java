package guice.guice_tutorial.project;

import com.google.inject.Inject;

public class SomeModel
{
	private final String name;

	@Inject
	private SomeModel(Builder builder)
	{
		this.name = builder.name;
	}

	public String getName()
	{
		return name;
	}

	public static class Builder
	{
		private String name;

		public Builder name(String name)
		{
			this.name = name;
			return this;
		}

		public SomeModel build()
		{
			return new SomeModel(this);
		}
	}
}
