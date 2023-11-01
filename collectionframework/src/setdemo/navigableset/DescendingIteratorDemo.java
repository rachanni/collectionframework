package setdemo.navigableset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class DescendingIteratorDemo {

	public static void main(String[] args) {
		
		NavigableSet<String>strings=new TreeSet<>(Set.of("a","b","c","d","e"));
		Iterator<String>di=strings.descendingIterator();
		
		System.out.println("Iterating in the descending order:");
		while(di.hasNext()) {
			System.out.println(di.next());
		}
	}
}
