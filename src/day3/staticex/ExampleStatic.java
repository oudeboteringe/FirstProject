package day3.staticex;

public class ExampleStatic {
	// static data
	static int staticVariable;
	
	int nonStaticVariable;
	
	// static method
	static public void staticMethod()
	{
		System.out.println("StaticVariable = " + staticVariable);
		staticVariable++;
	}
	
	// non-static method
	public void nonStaticMethod()
	{
		System.out.println("nonStaticVariable = " + nonStaticVariable);
		nonStaticVariable++;
	}
	
	static {
		System.out.println("Static block of code");
	}
	
	ExampleStatic(){
		System.out.println("Constructor");
	}
}
