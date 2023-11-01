package collection;

import java.util.ArrayList;
import java.util.Collection;

//compare result of two different implementation 1. HashSet and 2. ArrayList
public class AddAllDemo {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String> first=new ArrayList<String>();
		first.add("one");
		first.add("four");
		
		boolean hasChanged=strings.addAll(first); //add all elements of first to strings
		
		System.out.println("Has strings changed? "+hasChanged);
		System.out.println("strings="+strings);
		

	}

}
