//package rvision;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Fruit implements Comparator{
//	
//	private int id;
//	private String name;
//	private String taste;
//	
//	Fruit(int id,String name, String taste){
//		
//		this.id=id;
//		this.name=name;
//		this.taste=taste;
//	}
//
//	@Override
//	public String toString() {
//		
//		return id + ","+ name + "," + taste ;
//	}
//
//	public int compare(Fruit f1,Fruit f2) {
//		
//		int temp=(f1.id<f2.id)?-1:(f1.id>f2.id)?1:0;
//		return temp;
//	}
//	
//	
//	
//	
//}
//
//public class ImplementingComparable {
//
//	public static void main(String[] args) {
//		
////		list contaning fruit
//		List<Fruit>l=new ArrayList<Fruit>();
//		l.add(new Fruit(1,"Apple","Sweet"));
//		l.add(new Fruit(2,"Orange","Sour"));
//		l.add(new Fruit(4,"Bananan","Sweet"));
//		l.add(new Fruit(3,"Grape","Sweet and Sour"));
//		Collections.sort(l,new Fruit(0, null, null));
//		
//		System.out.println(l);
//		
//		
//		
//		
//	}
//}
