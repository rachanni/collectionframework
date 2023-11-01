package rvision.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//iterating through collection using iterator

public class UsingIterator {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
//		creating an instance of the iterator
		Iterator<String>iterator=strings.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
//		using for loop
		System.out.println("Using for loop-");
		
		for(Iterator<String>iterator1=strings.iterator();iterator1.hasNext();) {
			System.out.println(iterator1.next());
		}
		
	}
}
