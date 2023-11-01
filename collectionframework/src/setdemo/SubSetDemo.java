package setdemo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetDemo {

	public static void main(String[] args) {
		
		SortedSet<String>strings=new TreeSet<>(Set.of("a","b","c","d","e","f"));
		SortedSet<String>subSet=strings.subSet("aa", "d");
		System.out.println("sub set = "+subSet);
		SortedSet<String>subSet1=strings.subSet("b", "d");
		System.out.println(subSet1);
		SortedSet<String>subSet2=strings.subSet("bt", "dp");
		System.out.println(subSet2);
	}
}
