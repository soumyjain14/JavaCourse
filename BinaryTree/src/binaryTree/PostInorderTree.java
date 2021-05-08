package binaryTree;

import java.util.LinkedList;



public class PostInorderTree {
	
	public static BinaryTreeNode<Integer> helperTree(int postOrder[], int inOrder[], int PostS, int PostE, int InS, int InE){
		if(InS>InE) {
			return null;
		}
		int root=postOrder[PostE];
		int rootIndex=-1;
		for(int i=InS;i<=InE;i++) {
			if(root==inOrder[i]) {
				rootIndex=i;
				break;
			}
		}
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(root);
		int LPostS=PostS;
		int LInS=InS;
		int LInE=rootIndex-1;
		int LPostE=LInE-LInS+LPostS;
		int RPostS=LPostE+1;
		int RPostE=PostE-1;
		int RInS=rootIndex+1;
		int RInE=InE;
		BinaryTreeNode<Integer> leftTree=helperTree(postOrder, inOrder, LPostS, LPostE, LInS, LInE);
		BinaryTreeNode<Integer> rightTree=helperTree(postOrder, inOrder, RPostS, RPostE, RInS, RInE);
		rootNode.left=leftTree;
		rootNode.right=rightTree;
		return rootNode;
		
	}
	
	public static BinaryTreeNode<Integer> buildTree(int postOrder[], int inOrder[]){
		return helperTree(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {
			return;
		}

		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> frontNode=queue.poll();
			String toBePrinted="";

			toBePrinted=frontNode.data+":";	
			if(frontNode.left!=null) {
				toBePrinted+="L:"+frontNode.left.data+",";
				queue.add(frontNode.left);
			}
			if(frontNode.right!=null) {
				toBePrinted+="R:"+frontNode.right.data;
				queue.add(frontNode.right);	
			}
			System.out.println(toBePrinted);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int postOrder[]= {4,5,2,6,7,3,1};
		int inOrder[]= {4,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root=buildTree(postOrder,inOrder);
		printLevelWise(root);
	}

}
