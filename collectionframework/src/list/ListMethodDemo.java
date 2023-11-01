package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethodDemo {

	public static void main(String[] args) {
		
//		This is immutable so you cant't modify it.
//		List<String>name=List.of("Ram","Shyam","Sita","Radha");
		List<String>name=new ArrayList<String>();
//		adding an element
		name.add("Lakshman");
		name.add("Arjun");
//		getting an element at the particular index
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		System.out.println("-------------------");
//		replacing the element at the particular index
		name.set(0, "Karn");
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		System.out.println("-------------------");
		name.add("Kunti");
		
		//add element at the particular index
		//we are adding at the 0 index at which Karn is there so now Karn is adjusted to inedx 1
		name.add(0,"Yudhistir");
		

		for(String x:name) {
			System.out.println(x);
		}
		
		//add element at the 1 index
		//element at the index 1 will be adjusted to 2
		name.add(1,"Bhismpitamh");
		
		System.out.println("-------------------");
		for(String x:name) {
			System.out.println(x);
		}
		
		//add element to the last index
		//size of the List increase and element at the last index will be at the new last index
		//movement will be always right side
		name.add(4,"Eklavya");
		
		System.out.println("-------------------");
		for(String x:name) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		name.add("Kunti");
		System.out.println(name.indexOf("Kunti"));
		System.out.println(name.lastIndexOf("Kunti"));

	}

}
