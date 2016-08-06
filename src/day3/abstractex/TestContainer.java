package day3.abstractex;

public class TestContainer {

	public static void main(String[] args) {
		Container c1 = new CircleContainer();
		c1.CalculateVolume(10, 5);
		
		Container s1 = new SquareContainer();
		s1.CalculateVolume(10, 5);

	}

}
