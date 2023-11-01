package rvision.navigableset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class FllorDemp {

	public static void main(String[] args) {
		
		NavigableSet<Integer>strings=new TreeSet<>(Set.of(7,8,12,15));
		System.out.println(strings);
		
		System.out.println(strings.floor(5));
		
//		System.out.println(strings.ceiling(7));
		
	}
}
