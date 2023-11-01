package customsortingonthebasisoftaste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortObjectUsingCustomLogic {

	
public static void main(String[] args) {
		
		List<Fruit>fruitList=new ArrayList<>();
//		create Fruit object
		Fruit apple=new Fruit(1, "Apple", "Sweet");
		Fruit orange=new Fruit(2, "Orange","Sour");
		Fruit banana=new Fruit(4,"Banana","Bweet");
		Fruit grape=new Fruit(3, "Grape","Sweet and Sour");
		
//		now add these object to the List
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		fruitList.add(grape);
		
//		sort the object by name
		
		Collections.sort(fruitList,new SortOnBasisOfTaste());
		fruitList.forEach(fruit -> {
		    System.out.println(fruit.getId() + " " + fruit.getName() + " " + 
		      fruit.getTaste());
		});

	}

}
