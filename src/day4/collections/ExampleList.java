package day4.collections;

import java.util.List;
import java.util.ArrayList;

public class ExampleList {

	public static void main(String[] args) {
		String arr[] = new String[10];
		arr[0] = "zero";
		arr[9] = "nine";
		//arr[10] = "onemore";
		
		// Non-generic list, can add anything
		List list = new ArrayList();
		list.add("zero");
		list.add("one");
		list.add(2);
		list.add(true);
		
		for(Object temp: list)
		{
			System.out.println(temp);;
		}

		System.out.println("-----------");
		List<String> gList = new ArrayList<>();
		gList.add("zero");
		gList.add("one");
		gList.add("two");
		gList.add("three");
		gList.add("four");
		//gList.add(5); //cannot add a number
		
		gList.remove(2);
		gList.remove("four");
		gList.add(0, "Start");
		for(String temp : gList)
		{
			System.out.println(temp);
		}
	}

}
