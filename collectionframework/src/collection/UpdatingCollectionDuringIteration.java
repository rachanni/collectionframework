package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UpdatingCollectionDuringIteration {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		for(String x:strings) {
			System.out.println(x);
		}
		Iterator<String>iterator=strings.iterator();
		
		//it will remove only one
		while(iterator.hasNext()) {
			String element=iterator.next();
			strings.remove(element);
		}
		
//		if(iterator.hasNext()==false) {
//			String element=iterator.next();
//			strings.remove(element);
//		}
		
		for(String x:strings) {
			System.out.println(x);
		}
	}
}
