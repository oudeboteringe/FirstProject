package day3.abstractex;

public abstract class Container {

	public void CalculateVolume(int length, int height)
	{
		double volume = calculateAreaOfBase(length)*height;
		System.out.println("Volume = " + volume);
	}
	
	public abstract double calculateAreaOfBase(int length);
}
