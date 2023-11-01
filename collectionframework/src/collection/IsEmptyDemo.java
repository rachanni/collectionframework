package collection;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmptyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String>strings=new ArrayList<String>();
		strings.add("one");
		strings.add("two");
		
		if(strings.isEmpty()) {
			System.out.println("strins is empty");
		}else {
			System.out.println("string is not empty");
		}
		
		System.out.println("The number of elements in strings is"+strings.size());

	}

}
