package factoryclass;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SwapDemo {

	public static void main(String[] args) {
		
		List<String>strings=new ArrayList<>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		strings.add("E");
		
		System.out.println("List before swapping : "+strings);
		
		Collections.swap(strings, 0, 4);
		
		System.out.println("List after swapping:"+strings);
		
	}
}
