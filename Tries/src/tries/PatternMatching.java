package tries;

import java.util.ArrayList;

public class PatternMatching {
	
	public static boolean patternMatching(ArrayList<String> vect, String pattern) {
		Trie trie=new Trie();
		for(int i=0;i<vect.size();i++) {
			trie.add(vect.get(i));
			for(int j=0;j<vect.get(j).length();j++) {
				trie.add(vect.get(i).substring(j));
			}
		}
		return trie.search(pattern);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> vect=new ArrayList<>();
		vect.add("this");
		vect.add("that");
		vect.add("bat");
		vect.add("am");
		vect.add("at");
		String pattern="he";
		System.out.println(patternMatching(vect, pattern));
		

	}

}
