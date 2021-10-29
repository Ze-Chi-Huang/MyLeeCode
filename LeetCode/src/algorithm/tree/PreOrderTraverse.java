package algorithm.tree;

public class PreOrderTraverse {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		TreeNode tree = Solution.arrayToTree(arr);
		
		preOrderTraverse(tree);
	}
	
	static void preOrderTraverse(TreeNode tree) {
		
		if(tree == null) return;
		System.out.print(tree + " ");
		preOrderTraverse(tree.left);
		preOrderTraverse(tree.right);
		
	}
	
}

class Solution{
	static TreeNode arrayToTree(int[] values) {
		return arrayToTree(values,0);
	}
	
	static TreeNode arrayToTree(int[] values, int i) {
		if(i >= values.length) return null;
		return new TreeNode(values[i], arrayToTree(values, 2 * i + 1) ,arrayToTree(values, 2 * i + 2));
	}
}

class TreeNode{
	
	TreeNode left;
	TreeNode right;
	Integer value;
	
	//建構子 : 每個TreeNode 都要有:
	TreeNode(int value,TreeNode left,TreeNode right){
		this.value = value;
        this.left = left;
        this.right = right;
	}
	
	public TreeNode(int value) {
		this(value,null,null);
	}
	
	@Override
	public String toString() {
		
		return value.toString();
	}
}