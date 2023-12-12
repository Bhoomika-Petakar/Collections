package List;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(29);
		list.add(78);
		list.add(56);
		list.add(29);
		System.out.println(list);
		
		list.add(200);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.add(4, 5000);
		System.out.println(list);
		
		System.out.println(list.get(5));
		
		
	}

}
