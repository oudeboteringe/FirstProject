package day4.collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("Alex", 98765.45);
		hm.put("Linda", 108765.45);
		hm.put("John", 88765.45);
		
		System.out.println(hm.get("Linda"));
	}

}
