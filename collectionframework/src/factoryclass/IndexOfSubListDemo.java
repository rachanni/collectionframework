package factoryclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexOfSubListDemo {

	public static void main(String[] args) {
		
		List<String>srclist=new ArrayList<>();
		srclist.add("A");
		srclist.add("B");
		srclist.add("C");
		srclist.add("D");
		srclist.add("E");
		
		List<String>targetlist=new ArrayList<String>();
		
		targetlist.add("C");
//		targetlist.add("D");
		targetlist.add("E");
		
		System.out.println(Collections.indexOfSubList(srclist,targetlist));
	}
}
