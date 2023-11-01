package map;

import java.util.HashMap;
import java.util.Map;

public class ValuesMethWithForEach {

	public static void main(String[] args) {
		
		Map<String,Integer>prices=new HashMap<>();
		prices.put("Shoes", 200);
		prices.put("Bag", 300);
		prices.put("Pant", 150);
		
//		We have declared x as int so compiler will unbox Integer to int
//		b/c key = String value = Integer so actual view is Collection<Integer>
		
		for(int x:prices.values()) {
			System.out.println(x);
		}

	}
}
