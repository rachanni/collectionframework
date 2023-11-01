package rvision.map;

import java.util.HashMap;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer>map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		System.out.println(map);
		System.out.println(map.replace("B", 10));
		System.out.println(map);
		
//		key is not present
		System.out.println(map.replace("E",5));
	}
}
