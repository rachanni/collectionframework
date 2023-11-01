package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratonUsingIteratorDemo {

	public static void main(String[] args) {
		
		
		Collection<String>strings=List.of("one","two","three","four","five");
		for(Iterator<String>iterator=strings.iterator();iterator.hasNext();) {
			String element=iterator.next();
			if(element.length()==3) {
				System.out.println(element);
			}
		}
		
	}
}
