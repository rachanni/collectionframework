package map;

import java.util.HashMap;
import java.util.Map;

public class ValuesWithNullValue {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put("one", 1);
		map.put("two", null);
		map.put("three", 3);
		map.put("four", null);
		map.put("five", 5);
		
//		No Exception, perfectly fine
		for(Integer x:map.values()) {
			System.out.println(x);
		}
		
//		Unboxing of Integer to int causes NullPointerException
		for(int x:map.values()) {
			System.out.println(x);
		}
	}
}
