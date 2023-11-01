package setdemo;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetDemo2 {

	public static void main(String[] args) {
		
		
		SortedSet<String>strings=new TreeSet<>(Set.of("a","c","b","aa","d","f","e"));
		System.out.println(strings);

	}

}
