package bst;

public class BinarySearchTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insertNode(4);
		bst.insertNode(2);
		bst.insertNode(6);
		bst.insertNode(1);
		bst.insertNode(3);
		bst.insertNode(5);
		bst.insertNode(6);	
		//bst.deleteNode(4);
		bst.printTree();
	}

}
//8
//1 4
//1 2
//1 6
//1 1
//1 3
//1 5
//1 6
//4