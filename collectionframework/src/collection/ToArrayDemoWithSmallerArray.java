package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ToArrayDemoWithSmallerArray {

	
	public static void main(String[] args) {
		
		Collection<String>strings=List.of("one","two");
		String zeroLengthTab[]= {};
//		passing a zero size array as parameter
		String result[]=strings.toArray(zeroLengthTab);
		System.out.println("zero length tab="+Arrays.toString(zeroLengthTab));
		System.out.println("result="+Arrays.toString(result));
		System.out.println("Is zero length tab and result same ?"+(result==zeroLengthTab));
		System.out.println("Reference of zero length tab="+zeroLengthTab.toString()+"Reference of result="+result.toString());
		
	}
}
