package rvision;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>first=new ArrayList<String>();
		first.add("one");
		
		boolean hasChanged=strings.retainAll(first);
		
		System.out.println(hasChanged);
		System.out.println(strings);
	}
}
