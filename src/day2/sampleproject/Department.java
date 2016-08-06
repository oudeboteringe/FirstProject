package day2.sampleproject;

import java.util.ArrayList;
import java.util.List;

public class Department {

		private String deptName;
		private double budget;
		//private Employee[] emps = new Employee[5];
		private List<Employee> emps = new ArrayList<>();
		//private int counter = 0;
		
		public Department (String deptName){
			this.deptName = deptName;
			this.budget = 50000;
		}
		
		public void AddEmployee(Employee obj){
			emps.add(obj);
			//counter++;
			
			if (obj.getGrade() >= 5){
				this.budget += 150000;
			}
			else{
				this.budget += 100000;
			}
		}
		
		public void describe(){
			String temp = "Dept Name: " + this.deptName
					+ "\nBudget: " + this.budget
					+ "\nEmployees:";
			for(Employee x : emps){
				//if (x != null){
					temp += x + " ";
				//}
			}
			System.out.println(temp);
		}
}
