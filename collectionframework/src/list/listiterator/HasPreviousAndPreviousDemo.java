package list.listiterator;

import java.util.List;
import java.util.ListIterator;

public class HasPreviousAndPreviousDemo {

	public static void main(String[] args) {

		List<String> strings = List.of("one", "two", "three", "four", "five");
		
		ListIterator<String> li=strings.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("======================");
		System.out.println("Iterating element in reverse order");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}
}
