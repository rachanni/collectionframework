package rvision.map;

import java.util.HashMap;
import java.util.Map;

public class ReplaceWithFinerControl {

	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		System.out.println(map);
		System.out.println(map.replace("B", 2,10));
		System.out.println(map.replace("C", 3,15));
		System.out.println(map.replace("A", 100,20));
		System.out.println(map);
		
	}
}
