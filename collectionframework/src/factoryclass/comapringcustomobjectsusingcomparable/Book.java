package factoryclass.comapringcustomobjectsusingcomparable;

public class Book implements Comparable<Book>{

	private String author;
	private String name;
	private int pageNumber;
	
	
	
	
	public Book(String author, String name, int pageNumber) {
		super();
		this.author = author;
		this.name = name;
		this.pageNumber = pageNumber;
	}


	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		return (this.pageNumber>book.pageNumber)?1:-1;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + name + ", pageNumber=" + pageNumber + "]";
	}
	
	

	
	
}
