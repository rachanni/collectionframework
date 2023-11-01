package sortingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo1 {

	public static void main(String[] args) {
		
		
		List<String>fruits=new ArrayList<>(List.of("Apple","Orange","Banana","Grape"));
		System.out.println("Without sorting"+fruits);
		System.out.println("--------------");
		Collections.sort(fruits);
		System.out.println("After sorting in lexical order"+fruits);

	}

}
