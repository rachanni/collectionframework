package setdemo.navigableset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class CeilingDemo {

	public static void main(String[] args) {
		
		NavigableSet<Integer>numberSet=new TreeSet<>(Set.of(7,8,12,15));
		
		System.out.println(numberSet);
		
		System.out.println(numberSet.pollLast());
		
		System.out.println(numberSet);
	}
}
