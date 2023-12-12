package List;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(400);
		ls.add(500);
		ls.add(600);
		ls.add(700);
		ls.add(800);
		ls.add(900);
		System.out.println(ls);
		
		ls.addFirst(2);
		System.out.println(ls);
		
		ls.addLast(6);
		System.out.println(ls);
		
		ls.removeFirst();
		System.out.println(ls);
		
		ls.removeLast();
		System.out.println(ls);
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		}
	}
