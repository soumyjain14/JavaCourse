package tries;

import java.util.ArrayList;

public class AutoComplete {

	public static void autoComplete(ArrayList<String> input, String word) {
		Trie trie=new Trie();
		for(int i=0;i<input.size();i++) {
			trie.add(input.get(i));
		}
		TrieNode newTrie=trie.find(word);
		if(newTrie!=null) {
			trie.findAllPairs(newTrie, word, "");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("of");
		list.add("office");
		list.add("off");
		list.add("noff");
		list.add("offo");
		String word="off";
		autoComplete(list, word);

	}

}
