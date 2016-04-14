package guice.guice_tutorial;

public class A extends B
{
	public void print(){
		System.out.println("This is main implementation");
	}

	@Override
	public void prepare()
	{
		System.out.println("this is prepare");
	}

	@Override
	public void translate()
	{
		System.out.println("this is translate");
	}
}
