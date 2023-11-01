package map;

import java.util.Map;
import java.util.HashMap;

public class RemoveDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "Go");
		
		System.out.println("Before removal :"+map);
		
		System.out.println("============");
		
		System.out.println("Value is mapped to the spaecified key 2:"+map.remove(2));
		System.out.println("Value is not mapped to the specified key 5: "+map.remove(5));
		
		System.out.println("===================");
		System.out.println("Value is mapped to the spaecified key 3:"+map.remove(3,"Go"));
		
		
		System.out.println("After removal:"+map);
	}
}
