package factoryclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleDemoWithRandomSeedValue {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>(List.of("A","B","C","D","E"));
		Collections.shuffle(list,new Random());
		System.out.println(list);
	}
}
