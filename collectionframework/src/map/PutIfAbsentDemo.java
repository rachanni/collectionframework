package map;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Ravi");
		map.put(2, "Gaurav");
		map.putIfAbsent(3, "Gulshan");
		map.putIfAbsent(1, "Sonu");
		map.putIfAbsent(4, "Golu");
		
		map.put(5, null);
		map.putIfAbsent(5, "Chalischor");
		
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey()+","+x.getValue());
		}
		
	}
}
