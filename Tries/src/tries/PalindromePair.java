package tries;

import java.util.ArrayList;

public class PalindromePair {

	public static boolean isPalindrome(String word, int startIndex, int endIndex) {
		if(startIndex>endIndex) {
			return true;
		}
		if(word.charAt(startIndex)!=word.charAt(endIndex)) {
			return false;
		}
		return isPalindrome(word, startIndex+1, endIndex-1);
	}

	public static boolean isPalindromePair(ArrayList<String> words) {
		for(int i=0;i<words.size();i++) {
			if(isPalindrome(words.get(i), 0, words.get(i).length()-1)) {
				return true;
			}
		}
		Trie trie=new Trie();
		for(int i=0;i<words.size();i++) {
			trie.add(reverseString(words.get(i)));
		}
		for(int i=0;i<words.size();i++) {
			return trie.search(words.get(i));
		}
		return false;
	}

	public static String reverseString(String input) {
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i)+"";
		}
		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> vect=new ArrayList<>();
		vect.add("abc");
		vect.add("def");
		vect.add("cbd");
		System.out.println(isPalindromePair(vect));
		//System.out.println(isPalindrome(word, 0, word.length()-1));


	}

}
