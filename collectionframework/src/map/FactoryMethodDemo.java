package map;

import java.util.Map;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=Map.of(
				1,"one",
				2,"two",
				3,"three",
				4,"four",
				5,"five",
				6,"six",
				7,"seven",
				8,"eight",
				9,"nine",
				10,"ten"
				
				);
		System.out.println(map);
	}
}
