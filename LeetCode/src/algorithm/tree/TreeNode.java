package algorithm.tree;

public class TreeNode {

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

class Solution{
	static TreeNode arrayToTree(int[] values) {
		return arrayToTree(values,0);
	}
	
	static TreeNode arrayToTree(int[] values, int i) {
		if(i >= values.length) return null;
		
		TreeNode left = arrayToTree(values, 2 * i + 1);
		TreeNode right = arrayToTree(values, 2 * i + 2);
		
		return new TreeNode(values[i], left, right);
	}
}