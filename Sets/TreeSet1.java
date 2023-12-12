package Sets;

import java.util.TreeSet;

import List.MyCompare;



public class TreeSet1 {
	public static void main(String[] args) {
		Mycompare compare = new Mycompare();
		TreeSet<Customers> set = new TreeSet<Customers>(compare);
		set.add(new Customers(5,"Bhoomika","Bhoomika@gmail.com"));
		set.add(new Customers(6,"Niharika","Niharika@gmail.com"));
		set.add(new Customers(2,"Niharika","Niha@gmail.com"));
		set.add(new Customers(1,"Nikhita","Nikhita@gmail.com"));
		
	
	for(Customers c:set) {
		System.out.println(c);
	}
	}


}
