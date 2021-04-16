package tree;

import java.util.LinkedList;
import java.util.Scanner;

public class PreOrderTraversal {
	
	public static TreeNode<Integer> takeInputBetter(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData=scan.nextInt();
		TreeNode<Integer> rootNode=new TreeNode<Integer>(rootData);
		LinkedList<TreeNode<Integer>> queue=new LinkedList<>();
		queue.add(rootNode);
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode=queue.poll();			
			System.out.println("Enter the number of children of "+ frontNode.data);
			int childCount=scan.nextInt();
			for(int i=0;i<childCount;i++) {
				System.out.println("Enter the value of "+(i+1)+" th child of "+frontNode.data);
				int child=scan.nextInt();
				TreeNode<Integer>childNode=new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				queue.add(childNode);
			}
		}
		return rootNode;
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		for(int i=0;i<root.children.size();i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
	
	public static void preOrder(TreeNode<Integer> root) {
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		postOrder(root);

	}

}
