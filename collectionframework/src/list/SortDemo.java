package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		
		
		List<String>strings=new ArrayList<>(List.of("1","7","2","8","3","-10"));
		//by default sorting in ascending order
		Collections.sort(strings);
		System.out.println("Ascending order "+strings);
		
		System.out.println("------------------------");
		List<String>strings1=new ArrayList<>(List.of("1","7","2","8","3","-10"));
		Collections.sort(strings1,Collections.reverseOrder());
		System.out.println("Descending order "+strings1);
		
//		sort in descending order
		

		
		
		
	}

}
