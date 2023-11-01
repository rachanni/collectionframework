package factoryclass.comapringcustomobjectsusingcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		List<Book>bookList=new ArrayList<>();
		
		Book book1=new Book("Ravi","Men should be strong physically and emotionally",230);
		Book book2=new Book("Guddu","	Men get love and respect ap per his wealth",700);
		Book book3=new Book("Kar","Men good nature does not matter",890);
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		Book minPage=Collections.min(bookList);
		Book maxPage=Collections.max(bookList);
		
		System.out.println(minPage);
		System.out.println(maxPage);
		
	}

}
