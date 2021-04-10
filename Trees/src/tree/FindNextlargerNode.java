package tree;

import java.util.LinkedList;
import java.util.Scanner;

public class FindNextlargerNode {

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

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		TreeNode<Integer> ans;
		if(root.data>n) {
			ans=root;
		}else {
			ans=null;
		}
		
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> temp=findNextLargerNode(root.children.get(i), n);
			if(ans==null && temp!=null) {
				ans=temp;
			}
			if(ans!=null && temp!=null) {
				if(ans.data>temp.data) {
					ans=temp;
				}
			}
			
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		root=findNextLargerNode(root, 10);
		if(root==null) {
			System.out.println(root);
		}else {
			System.out.println(root.data);
		}

	}

}
