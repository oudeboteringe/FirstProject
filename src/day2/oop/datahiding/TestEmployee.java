package day2.oop.datahiding;

public class TestEmployee {

	public static void main(String[] args) {
		Employee alex = new Employee();
		
		alex.setSalary(100000);
		alex.setBonus(20000);
		
		alex.calculateTotalPay();
		System.out.println(alex.getSalary());

	}

}
