//mississippi
//op: m=1 s=4 i=4 p=2



package Maps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		encryptString(s);
	}

	private static void encryptString(String s) {
	LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	String t="";
	for(int i=0;i<s.length();i++)  //mississippi
	{
		char ch=s.charAt(i);
		if(map.containsKey(ch)) {
			int count=map.get(ch);
			map.put(ch, count+1);
		}else {
			map.put(ch, 1);
		}
	}
		
		Set<Character> keys=map.keySet();
		for(char key:keys) {
			int value=map.get(key);
			t=t+key+value;
		
		}
		
		System.out.println(t);
	}
	
		
	

}
