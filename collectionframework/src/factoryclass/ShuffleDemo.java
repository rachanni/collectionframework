package factoryclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>(List.of("A","B","C","D","E"));
		System.out.println("List before shuffling: "+list);
		Collections.shuffle(list);
		System.out.println("List after shuffling: "+list);
	}
}
