package revision.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		
		Collection<String>first=new ArrayList<>();
		first.add("five");
		first.add("four");
		
		boolean hasChanged=strings.retainAll(first);
		System.out.println("Has strings changed? "+hasChanged);
		System.out.println("strins: "+strings);
	}
}
