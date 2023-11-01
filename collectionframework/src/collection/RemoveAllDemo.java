package collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>toBeRemoved=new ArrayList<String>();
		toBeRemoved.add("one");
		toBeRemoved.add("four");
		
		boolean hasChanged=strings.removeAll(toBeRemoved); // common elements from toBeRemoved and strings will
		                                                   // be removed
		
//		all the elements present in the toBeRemoved will be removed from strings
		System.out.println("Has strings changed?"+hasChanged);
		System.out.println("strings="+strings);

	}

}
