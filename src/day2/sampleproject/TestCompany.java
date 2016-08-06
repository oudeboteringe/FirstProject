package day2.sampleproject;

public class TestCompany {

	public static void main(String[] args) {
		Employee alex = new Employee("Alex Rod", 6);
		Employee linda = new Employee("Linda Berry", 7);
		Employee john = new Employee("John Doe", 3);
		Employee sara = new Employee("Sara Time", 7);
		Employee james = new Employee("James Doe", 4);
		
		Department sales = new Department ("XYZ Sales");
		Department IT = new Department("XYX IT");
		
		sales.AddEmployee(alex);
		sales.AddEmployee(linda);
		sales.AddEmployee(john);
		
		IT.AddEmployee(sara);
		IT.AddEmployee(james);
		
		sales.describe();
		System.out.println("---------------------");
		IT.describe();
	}

}
