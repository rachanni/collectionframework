package factoryclass;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseDemo {

	public static void main(String[] args) {
		
		List<String>strings=new ArrayList<>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		strings.add("E");
		
		System.out.println("Without/Before reverse: "+strings);
		Collections.reverse(strings);
		System.out.println("With/After reverse: "+strings);
	}
}
