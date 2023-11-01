package rvision.sortedset;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetDemo {

	public static void main(String[] args) {
		
		SortedSet<String>strings=new TreeSet<>(Set.of("b","c","d","e","f","a"));
		System.out.println(strings);
		SortedSet<String>subSet=strings.subSet("c", "f");
		System.out.println(subSet);
		
		SortedSet<String>strings1=new TreeSet<>(Set.of("a","c","b","aa","d","f","e"));
		System.out.println(strings1);
		SortedSet<String>subSet1=strings1.subSet("aa", "d");
		System.out.println(subSet1);
	}
}
