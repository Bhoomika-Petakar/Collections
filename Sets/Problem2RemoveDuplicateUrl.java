package Sets;

import java.util.Scanner;

import java.util.TreeSet;

public class Problem2RemoveDuplicateUrl {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		remove(s);
		
		}
	static void remove(String s) {
		TreeSet<String> set = new TreeSet<String>();
		String[] arr=s.split(",");
		for (String url : arr) {
			set.add(url);
		}	
		for (String url : set) {
			System.out.println(url);
		}
		
	}

}
