package day2.classandobject;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee alex  = new Employee();
		Employee linda = new Employee();
//		Employee john  = new Employee();

		alex.salary = 90000;
		alex.bonus  = 20000;
		alex.CalculateTotalPay();

		linda.salary = 100000;
		linda.bonus  = 20000;
		linda.CalculateTotalPay();
	}

}
