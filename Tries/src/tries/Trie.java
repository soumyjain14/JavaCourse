package tries;

class TrieNode{

	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		isTerminating=false;
		children=new TrieNode[26];
		childCount=0;
	}
}

public class Trie {

	private TrieNode root;

	public Trie() {
		// TODO Auto-generated constructor stub
		root=new TrieNode('\0');
	}

	private void add(TrieNode root, String word) {		
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
		add(child,word.substring(1));
	}

	public void add(String word) {		
		add(root,word);

	}
	
	private void remove(TrieNode root, String word) {
		if(word.length()==0) {
			root.isTerminating=false;
			return;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return;
		}
		remove(child,word.substring(1));
		// We have to remove the character from space wise als0
		// Check if character is non-terminating and number of children is 0
		if(!child.isTerminating && child.childCount==0) {
			root.children[childIndex]=null;
			root.childCount--;
		}
		// Method 2 to delete and memory optimisation
//		if(!child.isTerminating) {
//			int numIndex=0;
//			for(int i=0;i<26;i++) {
//				if(child.children[i]!=null) {
//					numIndex++;
//				}
//			}
//			if(numIndex==0) {
//				root.children[childIndex]=null;
//				child=null;
//			}
//		}
	}
	
	public void remove(String word) {
		remove(root,word);
	}
	
	
	private boolean search(TrieNode root, String word) {
		
		if(word.length()==0) {
			if(root.isTerminating==true) {
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
		boolean ans=search(child, word.substring(1));
		return ans;	
		
			
	}

	public boolean search(String word) {
		return search(root, word);		

	}
	
	private TrieNode find(TrieNode root, String word) {		
		if(word.length()==0) {
			return root;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) { 
			return null;
		}
		TrieNode ans=find(child, word.substring(1));
		return ans;	
		
			
	}

	public TrieNode find(String word) {
		return find(root, word);		

	}
	
	public void findAllPairs(TrieNode root, String word, String output) {
		if(root==null) {
			return;
		}
		if(root.childCount==0 && root.isTerminating==true) {
			System.out.println(word+output);
			return;
		}
		if(root.isTerminating) {
			output=word+output;
			System.out.println(output);
		}
		TrieNode child=null;
		for(int i=0;i<26;i++) {
			if(root.children[i]!=null) {
				child=root.children[i];
				findAllPairs(child, word+child.data, "");
			}
		}
		
		
	}

	public int countWords() {
		return countWords(root);
	}

	private int countWords(TrieNode root) {
		// TODO Auto-generated method stub
		int count=0;
		if(root.isTerminating==true) {
			count++;
		}
		for(int i=0;i<26;i++) {
			if(root.children[i]!=null)
			count+=countWords(root.children[i]);
		}
		return count;
	}
	
	
	

}
