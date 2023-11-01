package list.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DirectlyIteratingBackward {

	public static void main(String[] args) {
		
		List<String>fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		ListIterator<String>listIterator=fruits.listIterator(fruits.size());
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
