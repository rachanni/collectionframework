package revision.collection;
import java.util.Collection;
import java.util.ArrayList;

public class IsEmptyAndSize {

	public static void main(String[] args) {
		
		Collection<String>strings=new ArrayList<>();
		strings.add("one");
		strings.add("two");
		
		System.out.println(strings.isEmpty());
		System.out.println(strings.size());
	}
}
