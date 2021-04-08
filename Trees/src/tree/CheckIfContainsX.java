package tree;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckIfContainsX {
	
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
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
		if(root==null) {
			return false;
		}
		boolean ans=false;
		if(root.data==x) {
			return true;
		}		
		for(int i=0;i<root.children.size();i++) {
			ans=checkIfContainsX(root.children.get(i), x);
			if(ans==true) {
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		boolean ans=checkIfContainsX(root, 10);
		System.out.println(ans);

	}

}
