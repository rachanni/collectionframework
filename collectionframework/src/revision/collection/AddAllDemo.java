package revision.collection;

import java.util.ArrayList;
import java.util.Collection;

public class AddAllDemo {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>first=new ArrayList<>();
		first.add("one");
		first.add("four");
		first.add("five");
		
		boolean hasChanged=strings.addAll(first);
		System.out.println("Has strings changed?"+hasChanged);
		System.out.println("strings: "+strings);
		System.out.println("first: "+first);
	}
}
