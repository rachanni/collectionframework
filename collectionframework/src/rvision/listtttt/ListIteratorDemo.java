package rvision.listtttt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<String>numbers=new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		ListIterator<String>listIteratot=numbers.listIterator();
		
		System.out.println("Before: "+numbers);
		while(listIteratot.hasNext()) {
			String element=listIteratot.next();
			
			if(Objects.equals(element, "two")) {
				listIteratot.set("2");
			}
		}
		System.out.println("After: "+numbers);
	}
}
