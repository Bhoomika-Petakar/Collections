package List;

import java.util.Stack;

public class StacK {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s);
	
		s.pop();
		System.out.println(s);
	    
	    System.out.println(s.peek());
	    
	    System.out.println(s.search(40));
	    }

}
