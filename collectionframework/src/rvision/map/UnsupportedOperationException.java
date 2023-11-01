package rvision.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UnsupportedOperationException {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6,"six");
		
		Set<Integer>keys=map.keySet();
		Collection<String>values=map.values();
		
		System.out.println("keys: "+keys);
		System.out.println("values: "+values);
		
		Set<Map.Entry<Integer, String>>entries=map.entrySet();
		
		System.out.println(entries);
		
		System.out.println("==============");
//		adding key through keys
		
//		keys.add(7);
//		System.out.println(keys);
		
//		values.add("seven");
//		System.out.println("seven");
//		
//		removing through values
		values.remove("six");
		System.out.println("keys: "+keys);
		System.out.println(values);
		System.out.println(entries);
		
		System.out.println("===================");
//		removing through keys
		keys.remove(4);
		System.out.println("keys: "+keys);
		System.out.println(values);
		System.out.println(entries);
		
		
	}
}
