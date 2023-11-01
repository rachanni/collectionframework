package rvision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VariousMethodDemo {

	public static void main(String[] args) {
		
		List<String>strings=new ArrayList<>();
		
		
		strings.add("0");
		strings.add("1");
		strings.add("2");
		strings.add("3");
		strings.add("4");
		strings.add("5");
		
		System.out.println(strings);
		System.out.println("Object at the index 5 ? "+strings.get(5));
		System.out.println("size of the strings? "+strings.size());
		System.out.println("============================");
//		adding 10 at the index 1
		
		strings.add(1,"10");
		strings.add(6,"20");
		strings.add(0,"30");
		
//		replacing the element at the given index with the new element
		
		
		System.out.println(strings);
		System.out.println("Object at the index 5 ? "+strings.get(5));
		System.out.println("size of the strings? "+strings.size());
		System.out.println("============================");
		strings.set(1, "100");
		System.out.println(strings);
		System.out.println("size of the strings ? "+strings.size());
		
	}
}
