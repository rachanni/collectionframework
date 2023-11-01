package factoryclass.wrappingcollectioninimmutablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnmodifiableList1 {

public static void main(String[] args) {
		
		List<String>strings=new ArrayList<>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		
		List<String>unmodifiableStrings=Collections.unmodifiableList(strings);
		System.out.println("Unmodifiable list/view/wrapper: "+unmodifiableStrings);
		
//		Unsupported operation exception
		unmodifiableStrings.add("D");
		
		System.out.println("Unmodifiable list/view/wrapper: "+unmodifiableStrings);
		
		
	}
}
