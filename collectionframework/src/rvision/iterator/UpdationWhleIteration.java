package rvision.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UpdationWhleIteration {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		
		
		Iterator<String>iterator=strings.iterator();
		
		System.out.println("Is strings empty? "+strings.isEmpty());
		System.out.println("Size of the strings: "+strings.size());
		System.out.println(strings);
		
//		observ carefully last element will not be removed
		while(iterator.hasNext()) {
			String element=iterator.next();
			strings.remove(element);
			
			
		}
		System.out.println("Is strings empty? "+strings.isEmpty());
		System.out.println("Size of the strings: "+strings.size());
		System.out.println(strings);
	}
}
