package day1.exercises;

public class ExcersiceA {

	public static void main(String[] args) {
		// Calculate tax based on salery and tax rate
		
		double taxrate = 30.0; // Default
		int salary = 2000;
		if (salary <= 15000)
		{
			taxrate = 10.0;
		}
		else if (salary <= 40000)
		{
			taxrate = 20.0;
		}

		double tax = salary * taxrate *  0.01;
		System.out.println("Salary = " + salary + ", tax = " + tax + ".");
	}

}
