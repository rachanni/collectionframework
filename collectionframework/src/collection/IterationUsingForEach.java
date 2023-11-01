package collection;

import java.util.Collection;
import java.util.List;

public class IterationUsingForEach {
	
     public static void main(String[] args) {
		
    	 Collection<String>strings=List.of("one","two","three");
    	 for(String x:strings) {
    		 System.out.println(x);
    	 }
	}
}
