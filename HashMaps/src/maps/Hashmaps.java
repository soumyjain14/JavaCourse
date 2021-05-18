package maps;

import java.util.HashMap;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("abc", 1);
		map.put("def",2);
		map.put("abc1", 1);
		map.put("def1",2);
		
		System.out.println(map.size());
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsKey("abc1"));
		System.out.println(map.containsValue(2));
		int v=map.get("def1");
		System.out.println(v);
		Set<String> elements= map.keySet();
		for(String str:elements) {
			System.out.println(str);
		}
		
	}

}
