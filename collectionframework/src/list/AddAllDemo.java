package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddAllDemo {

	public static void main(String[] args) {
		
		
		List<String>strings=new ArrayList<>(List.of("0","1"));
		Collection<String>numberInWord=new ArrayList<>(List.of("zero","one"));
//		Collection<String>numberInWordSecond=new ArrayList<>(List.of("one"));
		
		//adding numberInWordFirst at index 1 and numberInWordSecond in at index 2
		
		strings.addAll(1,numberInWord);
		
		System.out.println(strings);
		
		
		
	}

}
