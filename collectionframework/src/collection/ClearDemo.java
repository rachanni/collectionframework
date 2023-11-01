package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ClearDemo {

	public static void main(String[] args) {
		Collection<String>strings=new ArrayList<>();
		
		strings.add("one");
		strings.add("two");
		
		System.out.println("The number of elelments in strings is "+strings.size());
		strings.clear();
		System.out.println("The number of elelments in strings is "+strings.size());
		
	}
}
