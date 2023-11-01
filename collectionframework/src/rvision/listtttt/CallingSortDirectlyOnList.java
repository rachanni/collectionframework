package rvision.listtttt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CallingSortDirectlyOnList {

	public static void main(String[] args) {
		
		List<String>fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
//		copy fruits to sortedFruits
//		this much easy to copy one arrayList to another
		List<String>sortedFruits=new ArrayList<>(fruits);
		
		System.out.println("Before sorting: "+sortedFruits);
//		fruits.sort(null);
		sortedFruits.sort(Comparator.naturalOrder());
		System.out.println("After sorting: "+sortedFruits);
		
		System.out.println("fruits is preserved:"+fruits);
		
	}
}
