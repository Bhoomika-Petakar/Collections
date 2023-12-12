package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {
	public static void main(String[] args) {
		//HashSet<Integer> set = new HashSet<Integer>();  //Displays op
		//LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();   //displays op in insertion order
		TreeSet<Integer> set = new TreeSet<Integer>();  //displys op in ascending order
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(80);
		set.add(50);
		set.add(60);
		System.out.println(set);
	}
}
