package map;

import java.util.HashMap;
import java.util.Map;

public class KeySetDemoForEach1 {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put( "one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		map.put("five",null);
		
		
		for(String x:map.keySet()) {
			map.putIfAbsent(x, -1);
		}
		
		System.out.println("==============================");
		
		for(int x:map.values()) {
			System.out.println(x);
		}
	}
}
