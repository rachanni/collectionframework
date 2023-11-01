package factoryclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateDemo {

	public static void main(String[] args) {
		
		List<String>strings=Arrays.asList("0","1","2","3","4");
		System.out.println(strings);
		int fromIndex=1,toIndex=4;
		Collections.rotate(strings.subList(fromIndex, toIndex), -2);
		System.out.println(strings);
	}
}
