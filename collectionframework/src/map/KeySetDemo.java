package map;

import java.util.HashMap;
import java.util.Map;

public class KeySetDemo {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		
		System.out.println(map.keySet());
		System.out.println(map);
	}
}
