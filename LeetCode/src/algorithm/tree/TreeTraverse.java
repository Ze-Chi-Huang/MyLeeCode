package algorithm.tree;

public class TreeTraverse {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		TreeNode tree = Solution.arrayToTree(arr);
		preOrderTraverse(tree);
		System.out.println();
		inOrderTraverse(tree);
		System.out.println();
		postOrderTraverse(tree);
	}
	
	public static void postOrderTraverse(TreeNode treeNode) {
		if(treeNode == null) return;
		
		postOrderTraverse(treeNode.left);
		
		postOrderTraverse(treeNode.right);
		
		doSomething(treeNode);
	}
	
	public static void inOrderTraverse(TreeNode treeNode) {
		if(treeNode == null) return;
		
		inOrderTraverse(treeNode.left);
		
		doSomething(treeNode);
		
		inOrderTraverse(treeNode.right);
	}
	
	public static void preOrderTraverse(TreeNode treeNode) {
		
		if(treeNode == null) return;
		
		doSomething(treeNode);
		
		preOrderTraverse(treeNode.left);
		
		preOrderTraverse(treeNode.right);
		
	}
	
	static void doSomething(TreeNode treeNode) {
		System.out.print(treeNode + " ");
	}
	
}
/*
class TreeUtils{
	
	public static Tree convertArrToTree(int[] arr) {
		return insertTree(arr, 0);
	}
	
	//index : 遍歷arr的
	private static Tree insertTree(int[] arr, int index) {
		
		if(index >= arr.length) return null; //>= : index 最多為arr.length-1
		
		//思考 : 左樹怎麼來? => 左樹是母樹i*2+1
		Tree leftTree = insertTree(arr, index*2+1);
		Tree rightTree = insertTree(arr, index*2+2);
		
		return new Tree(arr[index], leftTree, rightTree);
		
	}
	
}

//每棵樹的左子樹跟右子樹
class Tree {
	
	Tree leftTree;
	Tree rightTree;
	int data;
	
	public Tree(int data, Tree leftTree, Tree rightTree) {
		super();
		this.leftTree = leftTree;
		this.rightTree = rightTree;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Tree [data=" + data + "]";
	}
	
}*/
