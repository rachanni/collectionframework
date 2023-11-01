package collection;

import java.util.ArrayList;
import java.util.Collection;


// how you can check the presence of an user?
public class CheckingElementPresenceInCollection {
	
	

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		
		strings.add("one");
		strings.add("two");
		
		if(strings.contains("one")) {
			System.out.println("one is here");
		}
		
		if(!strings.contains("three")) {
			System.out.println("three is not here");
		}
		
	}

}
