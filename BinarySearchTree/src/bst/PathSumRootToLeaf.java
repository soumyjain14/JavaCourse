package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class PathSumRootToLeaf {
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner scan=new Scanner(System.in);
		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		System.out.println("Enter the root data");
		int rootData=scan.nextInt();
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(rootData);
		queue.add(rootNode);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode=queue.poll();
			if(frontNode==null) {
				return null;
			}
			BinaryTreeNode<Integer> leftNode=null;
			BinaryTreeNode<Integer> rightNode=null;
			System.out.println("enter the left data for "+frontNode.data);
			int leftData=scan.nextInt();
			if(leftData!=-1) {
				leftNode=new BinaryTreeNode<Integer>(leftData);
			}
			frontNode.left=leftNode;
			if(leftNode!=null) {
				queue.add(leftNode);
			}
			System.out.println("enter the right data for "+frontNode.data);
			int rightData=scan.nextInt();
			if(rightData!=-1) {
				rightNode=new BinaryTreeNode<Integer>(rightData);
			}			
			frontNode.right=rightNode;
			if(rightNode!=null) {
				queue.add(rightNode);
			}


		}

		return rootNode;
	}

	public static void helperF(BinaryTreeNode<Integer> root, int k, String output) {
		if(root==null) {
			return;
		}
		if((root.left==null && root.right==null) && root.data==k) {
			System.out.print(output.trim()+" "+root.data);
			System.out.println();
		}
		helperF(root.left, (k-root.data), output+" "+root.data);
		helperF(root.right, k-root.data, output+" "+root.data);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		helperF(root, k, "");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		rootToLeafPathsSumToK(root, 13);

	}

}
