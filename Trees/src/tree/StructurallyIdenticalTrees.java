package tree;

import java.util.LinkedList;
import java.util.Scanner;

public class StructurallyIdenticalTrees {
	
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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		boolean ans=false;
		if(root1==null || root2==null) {
			return false;
		}
		if(root1.data!=root2.data) {
			return false;
		}
		int max=Math.max(root1.children.size(), root2.children.size());
		for(int i=0;i<max;i++) {
			ans=checkIdentical(root1.children.get(i), root2.children.get(i));
			if(ans==false) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root1=takeInputBetter();
		TreeNode<Integer> root2=takeInputBetter();
		boolean ans=checkIdentical(root1, root2);
		System.out.println(ans);
	}

}
