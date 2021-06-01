package tries;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie=new Trie();
		trie.add("there");
		trie.add("their");
	//		trie.remove("there");
		System.out.println(trie.countWords());

	}

}
