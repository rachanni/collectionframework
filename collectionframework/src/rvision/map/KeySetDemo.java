package rvision.map;

import java.util.HashMap;

public class KeySetDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer>prices=new HashMap<>();
		prices.put("shoes", 200);
		prices.put("bag", 300);
		prices.put("pant", 150);
		prices.put("Jeans",null);
		
		
		System.out.println(prices.keySet());
		
		System.out.println("===========================");
		
//		get() 
//		
//		null b/c key shoesssssssssss is not present
		System.out.println(prices.get("shoesssssssssss"));
		
		System.out.println("===========================");
//		null b/c value is null - Intentional null
		System.out.println(prices.get("Jeans"));
		System.out.println("===========================");
//		using for-each loop
		for(String x:prices.keySet()) {
			
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("===========================");
		System.out.println(prices.getOrDefault("shoesssssssssss", -1));
		
		System.out.println("===========================");
		System.out.println(prices.getOrDefault("Jeans", -1));
		
	    
	}
}
