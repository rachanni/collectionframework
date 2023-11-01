package rvision.map.lambdaexpression;

import java.util.HashMap;
import java.util.Map;

public class ConsumingMap {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		map.forEach((key,value)->System.out.println(key+"::"+value));
		
	}
}
