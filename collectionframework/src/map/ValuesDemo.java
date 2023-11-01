package map;

import java.util.HashMap;
import java.util.Map;

public class ValuesDemo {

	public static void main(String[] args) {
		
		Map<String,Integer>prices=new HashMap<>();
		prices.put("Shoes", 200);
		prices.put("Bag", 300);
		prices.put("Pant", 150);
		
		System.out.println(prices);
		
		System.out.println("View of all the values:"+prices.values());
		
		
		
	}
}
