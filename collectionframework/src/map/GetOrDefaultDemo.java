package map;

import java.util.Map;
import java.util.HashMap;


public class GetOrDefaultDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "JavaScrit");
		map.put(4, null);
		
		
		System.out.println(map.getOrDefault(1, "UNDEFINED"));
		
//		if the key is not present
		
		System.out.println(map.getOrDefault(5, "UNDEFINED"));
		
		
	}
}
