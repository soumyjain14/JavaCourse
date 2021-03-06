package tree;

import java.util.LinkedList;
import java.util.Scanner;

public class SecondLargestElement {

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

	public static TreeNode<Integer> secondLargest(TreeNode<Integer> root){
		
		if(root.children.size()==0) {
			return root;
		}
		TreeNode<Integer> max=null;
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> temp=secondLargest(root.children.get(i));
			if(max==null && temp!=null) {
				max=temp;
			}
			if(max!=null) {
				if(temp.data>max.data) {
					max.data=temp.data;
				}
			}
		}
		return max;
		
	}
	
	public static TreeNode<Integer> replaceAll(TreeNode<Integer> root, int max){
		if(root.data==max) {
			root.data=-1;
		}
		for(int i=0;i<root.children.size();i++) {
			replaceAll(root.children.get(i), max);
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		TreeNode<Integer>max=secondLargest(root);
		System.out.println(max.data);
		root=replaceAll(root, max.data);
		TreeNode<Integer> secmax=secondLargest(root);
		System.out.println(secmax.data);


	}

}
