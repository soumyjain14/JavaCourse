package maps;

import java.util.HashMap;


public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("abc", 1);
		map.put("def",2);
		map.put("abc", 4);
		map.put("def1",2);
		
		int v=map.get("abc");
		map.put("abc", v+5);
		System.out.println(map.get("abc"));
		
	}

}
