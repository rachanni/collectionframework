package revision.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsAllDemo {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>first=new ArrayList<>();
		first.add("one");
		first.add("two");
		
		Collection<String>second=new ArrayList<>();
		second.add("one");
		second.add("four");
		
		System.out.println("Is first contained in the strings? "+strings.containsAll(first));
		System.out.println("Is second contained in the strings?"+strings.containsAll(second));
		
		
		
	}
}
