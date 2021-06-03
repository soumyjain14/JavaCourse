package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t;
		t=scan.nextInt();		
		Trie trie=new Trie();
		while(t>0) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			ArrayList<String> list=new ArrayList<>();
			for(int i=0;i<n;i++) {
				list.add(scan.next());
				trie.insert(list.get(i));
			}
			ArrayList<String> output=new ArrayList<>();
			for(int j=0;j<m;j++) {				
				output.add(scan.next());
				System.out.println(trie.search(output.get(j)));
			}

			t--;
		}
	}


}

class Trie{

	private TrieNode root;

	public Trie() {
		// TODO Auto-generated constructor stub
		root=new TrieNode('\0');

	}

	public void insert(String word) {
		insert(root,word);
	}

	private void insert(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length()==0) {
			root.isTerminating=true;
			return;
		}
		int childIndex=word.charAt(0)-'a';

		TrieNode child=root.children[childIndex];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}
		insert(child, word.substring(1));

	}


	public boolean search(String word) {
		return search(root,word);
	}

	private boolean search(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length()==0) {
			if(root.isTerminating) {
				return true;
			}else {
				return false;
			}
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return false;
		}
		return search(child, word.substring(1));

	}
	public boolean startsWith(String prefix) {
		return startsWith(root,prefix);
	}
	private boolean startsWith(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length()==0) {
			return true;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return false;
		}
		return startsWith(child, word.substring(1));

	}


}

class TrieNode{
	char data;
	TrieNode children[];
	boolean isTerminating;
	int childCount;

	public TrieNode(char data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		isTerminating=false;
		children=new TrieNode[26];

	}
}


