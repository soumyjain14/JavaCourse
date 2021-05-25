package maps;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new Map<>();
		map.insert("qwerty", 35);
		map.insert("qwerty", 50);
		map.removekey("cd");
		System.out.println(map.size());
		map.removekey("qwerty");
		map.removekey("abcde");
		

	}

}
