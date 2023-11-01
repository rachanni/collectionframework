package factoryclass.wrappingcollectioninimmutablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList2 {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("A");
		strings.add("B");
		strings.add("C");

		List<String> unmodifiableStrings = Collections.unmodifiableList(strings);
		System.out.println("Unmodifiable list/view/wrapper: " + unmodifiableStrings);


		strings.add("D");
		strings.add("E");

		System.out.println("Unmodifiable list/view/wrapper: " + unmodifiableStrings);

	}
}
