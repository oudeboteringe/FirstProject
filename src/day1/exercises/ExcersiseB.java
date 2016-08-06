package day1.exercises;

public class ExcersiseB {

	public static void main(String[] args) {
		String[] nums = {"10", "20", "30", "40"};
		int sum = 0;
		System.out.print("Numbers : ");
		for(String temp : nums)
		{
			sum += Integer.parseInt(temp);
			System.out.print(temp + " ");
		}
		System.out.println("");
		System.out.println("Sum of numbers = " + sum);

	}

}
