package tree;

import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner scan){
		System.out.println("Enter the data for Node");
		int n=scan.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter the number of children");
		int countChildren=scan.nextInt();
		for(int i=0;i<countChildren;i++) {
			TreeNode<Integer> child=takeInput(scan);
			root.children.add(child);
		}
		return root;
		
	}
	
	public static void printTree(TreeNode<Integer> root) {
		System.out.print(root.data+":");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+",");
		}
		System.out.println();
		for(int i=0;i<root.children.size();i++) {
			printTree(root.children.get(i));
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		TreeNode<Integer> root=takeInput(scan);
		printTree(root);
		
		

	}

}
