package rvision.listtttt;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo {

	public static void main(String[] args) {
		
		List<String>strings=new ArrayList<>(List.of("0","1","2","3","4","5"));
		System.out.println(strings);
		List<String>subList=strings.subList(2, 5);
		System.out.println(subList);
		
		
	}
}
