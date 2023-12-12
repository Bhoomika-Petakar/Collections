package Sets;

import java.util.Comparator;

import List.Customers;

public class Mycompare implements Comparator<Customers>{

		@Override
		public int compare(Customers c1, Customers c2) {
			String name1=c1.getName();
			String name2=c2.getName();
			
			return name1.compareTo(name2);
		}
		

	

}
