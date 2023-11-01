package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SetDemo {

	
	public static void main(String[] args) {
		
		
		List<String>strings=new ArrayList<>(List.of("one","two","three"));
		ListIterator<String>li=strings.listIterator();
		int loopCount=0;
		while(li.hasNext()) {
			loopCount++;
			if(li.next()=="two") {
				li.set("2");
			}
		}
		
		System.out.println(strings);
		System.out.println(loopCount);
	}
}
