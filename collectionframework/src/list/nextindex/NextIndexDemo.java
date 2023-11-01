package list.nextindex;

import java.util.List;
import java.util.ListIterator;

public class NextIndexDemo {

	
	public static void main(String[] args) {
		
		List<String>strings=List.of("A","B","C","D","E");
		
		ListIterator<String>li=strings.listIterator();
		
//		nextIndex() can not be used alone. if used then you will get infinite loop
//		getting index of the element to be returned by next
		while(li.hasNext()) {
			
			System.out.println(li.nextIndex()+":"+li.next());
			
		}
		
		System.out.println("Loop through elements in reverse order");
		while(li.hasPrevious()) {
			
			System.out.println(li.previousIndex()+":"+li.previous());
		}
	}
}
