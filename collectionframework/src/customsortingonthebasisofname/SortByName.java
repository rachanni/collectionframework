package customsortingonthebasisofname;

import java.util.Comparator;

public class SortByName implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
