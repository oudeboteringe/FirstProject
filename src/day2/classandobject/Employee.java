package day2.classandobject;

public class Employee {

	double salary;
	double bonus;
	
	void CalculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total pay = " + totalPay);
	}
}
