package rvision.map;

import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
//		Creating instance of Map.entry
		Map.Entry<Integer, String>e1=Map.entry(1, "one");
		Map.Entry<Integer, String>e2=Map.entry(2, "two");
	
//		passing e1,e2 as parameter
		Map<Integer,String>map1=Map.ofEntries(e1,e2);
		
		System.out.println(map1);
		
//		Another way 
//		Everthing in one line
		
		Map<Integer,String>map2=Map.ofEntries(Map.entry(3, "three"),Map.entry(4, "four"),Map.entry(5, "five"));
		System.out.println(map2);
	}
}
