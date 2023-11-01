package customsortingonthebasisoftaste;
public class Fruit implements Comparable<Object>{
	private int id;
	private String name;
	private String taste;
	public Fruit(int id, String name, String taste) {
		
		this.id = id;
		this.name = name;
		this.taste = taste;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTaste() {
		return taste;
	}


	public void setTaste(String taste) {
		this.taste = taste;
	}


	@Override
	public int compareTo(Object o) {
		Fruit f=(Fruit)o;
		return this.id-f.id;
	}
	
	
}