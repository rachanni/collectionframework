package collection;
// getting collections in an Array

import java.util.*;
public class ToArrayDemo {

	public static void main(String[] args) {
		
		
		Collection<String> strings=List.of("one","two","three","four","five");
		String largerTab[]= {"one","two","three","four","five","six","seven","eight","nine","ten"};
//		System.out.println(largerTab.toString(largerTab));
		System.out.println(Arrays.toString(largerTab));
		String result[]=strings.toArray(largerTab);
//		System.out.println(result);
		System.out.println(Arrays.toString(result));
		System.out.println("Is result and largerTab same array?"+(result==largerTab));
		System.out.println("Reference of largerTab="+largerTab.toString()+"Reference of result="+result.toString());
		

	}

}
