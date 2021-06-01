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
		return trie.find(pattern);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> vect=new ArrayList<>();
		vect.add("abc");
		vect.add("def");
		vect.add("ghi");
		vect.add("hg");
		String pattern="hif";
		System.out.println(patternMatching(vect, pattern));
		

	}

}
