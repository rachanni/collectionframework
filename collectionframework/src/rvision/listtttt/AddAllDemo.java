package rvision.listtttt;

import java.util.ArrayList;
import java.util.List;

public class AddAllDemo {

	public static void main(String[] args) {
		
		List<String>strings=new ArrayList<>(List.of("0","1","2","3","4","5"));
		List<String>strings1=new ArrayList<>(List.of("0","1","2","3","4","5"));
		List<String>first=new ArrayList<>(List.of("6","7"));
		
		System.out.println("Initailly strings: "+strings);
		boolean hasChanged=strings.addAll(first);
		System.out.println("hasChanged? "+hasChanged);
		System.out.println("After adding all elelments of first to strings: "+strings);
		
//		now adding all the elements at the specific index
		
		strings1.addAll(1,first);
		System.out.println(strings1);
		
	}
}
