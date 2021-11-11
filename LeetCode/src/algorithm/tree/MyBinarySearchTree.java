package algorithm.tree;

public class MyBinarySearchTree {

	public static void main(String[] args) {
		
		int[] arr = {10,25,31,40,51,56,17,8,49,20};
		MyBinarySearchTree tree = new MyBinarySearchTree();
		
		for(int value : arr) {
			tree.insert(value);
		}
		
		//Inorder
		tree.inOrder();
	}
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int data) {
			this.key = data;
			left = right = null;
		}
	}
	
	Node root;
	
	public MyBinarySearchTree() {
		root = null;
	}
	
	void insert(int key) {
		root = insert_recursive(root, key);
	}

	Node insert_recursive(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insert_recursive(root.left, key);
		}else if(key > root.key){
			root.right = insert_recursive(root.right, key);
		}
		
		return root;
	}
	
	void inOrder() {
		inorder_Recursive(root); 
	}
	
	// recursively traverse the BST  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    }

    
}
