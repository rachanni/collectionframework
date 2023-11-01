package revision.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAll {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>first=new ArrayList<>();
		first.add("one");
		first.add("four");
		first.add("three");
		
		boolean hasChanged=strings.removeAll(first);
		System.out.println("Has strings changed? "+hasChanged);
		System.out.println("string after removal: "+strings);
		
	}
}
