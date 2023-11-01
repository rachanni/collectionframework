package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SetPreviousDemo {

	
	public static void main(String[] args) {
		
		
		List<String>strings=new ArrayList<>(List.of("one","two","three"));
		ListIterator<String>li=strings.listIterator();
		int size=strings.size()-1;
		int loopCount=0;
		
//		while(li.hasNext()) {
//			loopCount++;
//			if(li.next()=="two") {
//				li.set("2");
//			}
//		}
		
		while(li.hasPrevious()) {
			if(li.previous()=="one") {
				li.set("1");
			}
			loopCount++;
		}
		
		System.out.println(strings);
		System.out.println(loopCount);
	}
}
