package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementsInRange {
	
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

	public static void elementsInRange(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root==null) {
			return;
		}
		if(k1<root.data) {
		elementsInRange(root.left, k1, k2);
		}
		if(k1<=root.data && k2>=root.data) {
			System.out.print(root.data+" ");
		}
		if(k2>root.data) {
		elementsInRange(root.right, k1, k2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		elementsInRange(root, 6, 10);

	}

}