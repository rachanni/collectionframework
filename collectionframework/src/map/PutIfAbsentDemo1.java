package map;

import java.util.Map;
import java.util.HashMap;

public class PutIfAbsentDemo1 {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		
		map.put("one", 1);
		map.put("two", null);
		map.put("three", 3);
		map.put("four", null);
		map.put("five", 5);
		
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getValue());
		}
	}
}
