package maps;

import java.util.HashMap;

public class ExtractUniqueCharacters {

	public static String uniqueCharacters(String str) {
		HashMap<Character, Boolean> map=new HashMap<>();
		String output="";
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				continue;
			}else {
				String m=Character.toString(str.charAt(i));
				output+=m;
				map.put(str.charAt(i), true);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="bbaweeewwssbb";
		String output=uniqueCharacters(input);
		for(int i=0;i<output.length();i++) {
			System.out.print(output.charAt(i)+"");
		}

	}

}
