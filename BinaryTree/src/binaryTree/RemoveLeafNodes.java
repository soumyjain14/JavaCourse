package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;



public class RemoveLeafNodes {
	
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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			root=null;
			return root;
		}
		
		BinaryTreeNode<Integer> lr=removeAllLeaves(root.left);
		BinaryTreeNode<Integer> rr=removeAllLeaves(root.right);
		root.left=lr;
		root.right=rr;
		return root;
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null) {
			return;
		}
		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		queue.add(root);
        System.out.println(root.data);
		while(!queue.isEmpty()) {
            int size=queue.size();
            String toBePrinted="";
            while(size!=0){
			BinaryTreeNode<Integer> frontNode=queue.poll();				
				
				if(frontNode.left!=null) {
				toBePrinted+=frontNode.left.data+" ";
				queue.add(frontNode.left);
				}
				if(frontNode.right!=null) {
				toBePrinted+=frontNode.right.data+" ";
				queue.add(frontNode.right);	
				}
                size=size-1;
            }
            if(size!=0){
                System.out.print(toBePrinted+" ");
            }else{
                System.out.println(toBePrinted);
            }
				
					
	
		}
	}
        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		BinaryTreeNode<Integer> temp=removeAllLeaves(root);
		printLevelWise(temp);
		

	}

}
