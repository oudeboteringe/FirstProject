package day3.abstractex;

public class CircleContainer extends Container{

	@Override
	public double calculateAreaOfBase(int length) {
		double area = Math.PI*(length/2) * (length/2);
		System.out.println("Circle area = " + area);
		return area;
	}

}
