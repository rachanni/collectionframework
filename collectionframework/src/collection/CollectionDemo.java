package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String []args) {
		
	Collection<String> strings=new ArrayList<>();
	strings.add("one");
	strings.add("two");
	System.out.println(strings);
	strings.remove("one");
	System.out.println(strings);
	
	if(strings.contains("two")) {
		System.out.println("two is here");
	}
	if(!strings.contains("three")) {
		System.out.println("three is not here");
	}
	
	
	
	
	}
}
