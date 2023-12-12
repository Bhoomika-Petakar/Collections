package Sets;

import java.util.TreeSet;

public class CompareToMethod {
	public static void main(String[] args) {
		TreeSet<Customer> set = new TreeSet<Customer>();
		set.add(new Customer(5,"Bhoomika","Bhoomika@gmail.com"));
		set.add(new Customer(6,"Niharika","Niharika@gmail.com"));
		set.add(new Customer(2,"Niharika","Niha@gmail.com"));
		set.add(new Customer(1,"Nikhita","Nikhita@gmail.com"));
		
	
	for(Customer c:set) {
		System.out.println(c);
	}
	}

}
