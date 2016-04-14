package guice.guice_tutorial;

public abstract class B implements BI
{
	public abstract void prepare();
	
	public final String text(){
		prepare();
		translate();
		return "this is class B";
	}
	
	public abstract void translate();
}
