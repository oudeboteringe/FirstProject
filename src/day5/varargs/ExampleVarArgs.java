package day5.varargs;

public class ExampleVarArgs {
	// variable arguments
	
	public static void addNumbers(String b, int ...a )
	{
		int sum = 0;
		for(int x:a)
		{
			sum += x;
		}
		System.out.println("Sum = " + sum + " b = " + b);
	}
	
	public static void main(String args[])
	{
//		ExampleVarArgs obj = new ExampleVarArgs();
//		obj.addNumbers(3, 4, 5);
		ExampleVarArgs.addNumbers("Some text", 3, 4, 5, 78, 92, 34);
	}
}
