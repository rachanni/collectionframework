package map;

import java.util.HashMap;
import java.util.Map;

public class FaultyNullValueRemoval {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put("one", 1);
		map.put("two", null);
		map.put("three", 3);
		map.put("four", null);
		map.put("five", 5);
		
//		for each key-value pair where value is null
//		replace those value with -1
//		null is considered as no value
		for(String x:map.keySet()) {
			map.putIfAbsent(x, -1);
		}

		for(int x:map.values()) {
			System.out.println(x);
		}
		
				
	}
}
