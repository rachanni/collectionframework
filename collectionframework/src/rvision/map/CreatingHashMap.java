package rvision.map;

import java.util.HashMap;
import java.util.Map;

public class CreatingHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
