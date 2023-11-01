package map;

import java.util.Map;
import java.util.HashMap;


public class KeySetDemoForEach {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
//		Why String x b/c Key is of type String
		for(String x:map.keySet()) {
			System.out.println(x);
		}
	}
}
