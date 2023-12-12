package Sets;
import java.util.*;
public class Problem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		
		//HashSet<Character> hashSet = new HashSet<Character>();
		LinkedHashSet<Character> hashSet = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hashSet.add(s.charAt(i));
		}
		String t="";
		for (Character ch : hashSet) {
			t=t+ch;
			
		}
		System.out.println(t);
		
		
	}

}
