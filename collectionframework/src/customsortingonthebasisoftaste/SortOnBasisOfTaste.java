package customsortingonthebasisoftaste;

import java.util.Comparator;

public class SortOnBasisOfTaste implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.getTaste().compareTo(o2.getTaste());
	}
}
