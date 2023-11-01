package collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>toBeRetained=new ArrayList<String>();
		toBeRetained.add("one");
		toBeRetained.add("four");
		toBeRetained.add("three");
//		all the elements present in the toBeRetained and also present in the strings will be retained
//		and all other elements will be removed
//		intersection
		boolean hasChanged=strings.retainAll(toBeRetained);
		
		System.out.println("Has strings changed?"+hasChanged);
		System.out.println("strings="+strings);

	}

}
