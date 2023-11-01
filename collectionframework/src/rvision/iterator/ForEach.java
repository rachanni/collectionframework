package rvision.iterator;

import java.util.ArrayList;
import java.util.Collection;

public class ForEach {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		strings.add("five");
		
		
		
		for(String element:strings) {
			if(element.length()==3) {
				System.out.println(element);
			}
		}
		
	}
}
