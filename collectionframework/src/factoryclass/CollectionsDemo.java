package factoryclass;

import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer>list=List.of(6,8,5,4,1,2);
		
		Integer min=Collections.min(list);
		Integer max=Collections.max(list);
		
		System.out.println("Minimun element is: "+min);
		System.out.println("Maximum element is: "+max);
	}
}
