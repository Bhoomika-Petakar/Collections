package Maps;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class Hashmap2 {
	public static void main(String[] args) {
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("india",10000);
		hashMap.put("Italy",500);
		hashMap.put("China",5000);
		hashMap.put("China",8000);
		hashMap.put("USA",7000);
		hashMap.put("UAE",3000);
		hashMap.put("UK",8000);
		hashMap.put("WI",9000);
		System.out.println(hashMap);
		
		Set<String> key=hashMap.keySet();		
		System.out.println(key);
		
		for(String k:key) {
			System.out.println(k);
		}
		
		for(String k:key) {
			Integer value=hashMap.get(k);
			System.out.println(k+" "+value);
		}
		
		
		Set<entry<String,Integer>> e=hashMap.entrySet();
		
		
		
	}

}
