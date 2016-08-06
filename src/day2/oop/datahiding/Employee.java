package day2.oop.datahiding;

public class Employee {
	private double salary;
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setSalary(double salary){
		if (salary >= 40000 && salary <= 200000){
			this.salary = salary;
		}else{
			this.salary = 0;
			System.out.println("Please check salary");
		};
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("TotalPay = " + totalPay);
	}

}
