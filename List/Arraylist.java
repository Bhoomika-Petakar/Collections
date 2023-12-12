package List;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(19);
		list.add(25);
		list.add(25); //duplicates are allowed
		list.add(true);
		list.add(null);
		list.add(null);
		list.add(new String("krishna"));
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		
		
	}
	

}
