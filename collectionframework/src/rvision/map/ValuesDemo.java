package rvision.map;

import java.util.HashMap;

public class ValuesDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer>prices=new HashMap<>();
		prices.put("shoes", 200);
		prices.put("bag", 300);
		prices.put("pant", null);
		
//		Getting rid of unwanted null value
//		step 1- Getting set of key
//		then checking if for key x value is null then replacing with -1
		
		for(String x:prices.keySet()) {
			prices.putIfAbsent(x, -1);
		}
		
		System.out.println(prices.values());
		
//		using the for each loop
		
		for(int x:prices.values()) {
			
			System.out.print(x+",");
		}
	}
}
