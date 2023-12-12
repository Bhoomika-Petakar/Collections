package Maps;


import java.util.WeakHashMap;

public class WeakHashmap {
	public static void main(String[] args) {
		WeakHashMap<String, Integer> map = new WeakHashMap<String, Integer>();
//		String s1="TAP";
//		String s2="TAP";
		String s1 = new String("TAP");
		String s2 = new String("TAP");
		System.out.println(s1==s2); //Compares the reference
		
		map.put(s1,100);
		map.put(s2,400);
		
		System.out.println(map);
		s1=null;
		s2=null;
		System.gc();
		System.out.println(map);
	}


}
