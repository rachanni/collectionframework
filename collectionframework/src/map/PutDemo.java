package map;

import java.util.HashMap;
import java.util.Map;

public class PutDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		
//		If key is already present then existing value will be replaced by ne value
		map.put(3, "Orange");
		
		map.put(1, "Orange");
		
		map.put(4, null);
		
//		Iterating over map
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey()+","+x.getValue());
		}
	}
}
