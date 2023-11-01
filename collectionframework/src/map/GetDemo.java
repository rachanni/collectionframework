package map;

import java.util.Map;
import java.util.HashMap;

public class GetDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		
		map.put(1, "Java");
		map.put(2,"Python");
		map.put(3, "JavaScript");
		
//		Get the value asscociated with key 1
		
		System.out.println(map.get(1));
//		Get the value associated with key 3
		
		System.out.println(map.get(3));
		
//		null will be returned key is not present in the map
		System.out.println(map.get(4));
	}
}
