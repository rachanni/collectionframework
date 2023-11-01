package setdemo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<String>set=new TreeSet<>(Set.of("e","b","c","a","d"));
		System.out.println(set);
		
//		toElememt is excluded in the returned subset
//		fromElement is included in the returned subset
		SortedSet<String>subset1=set.subSet("b", "d");
		System.out.println(subset1);
		
		SortedSet<String>subset2=set.subSet("b", "c");
		System.out.println(subset2);
		
//		if toElement is not found in the Set then all the element from the fromElement will be in returned subset
		SortedSet<String>subset3=set.subSet("b", "j");
		System.out.println(subset3);
		
//		neither of the fromElement and toElement is in the SortedSet then empty set will be returned
		SortedSet<String>subset4=set.subSet("g", "t");
		System.out.println(subset4);
		
		SortedSet<String>set1=new TreeSet<>(Set.of("l","j","d","s"));
		System.out.println(set1);
		
//		fromElement is not included in set
//		toElement is included in Set
//		
		SortedSet<String>subset5=set1.subSet("c", "s");
		System.out.println(subset5);
		
		SortedSet<String>subset6=set1.subSet("c", "t");
		System.out.println(subset6);
		

	}

}
