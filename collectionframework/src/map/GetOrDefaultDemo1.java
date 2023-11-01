package map;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class GetOrDefaultDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		
		List<String> list=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			String temp=map.getOrDefault(i, "UNDEFINED");
			list.add(temp);
		}
		
		System.out.println(list);
	}
}
