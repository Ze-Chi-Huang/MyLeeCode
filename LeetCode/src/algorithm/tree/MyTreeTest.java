package algorithm.tree;

public class MyTreeTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,0,4,0,0,3,0,0,0};
		MySolution solution = new MySolution(arr);
		
		MyTreeNode tree = solution.CreateBiTree();
		System.out.println(tree);
	}

}

class MySolution{
	
	int[] arr;
	
	public MySolution(int[] arr) {
		this.arr = arr;
	}
	
	public MyTreeNode CreateBiTree() {
		
		MyTreeNode root = new MyTreeNode(arr[0]);
		return CreateBiTree(root);
	}
	
	private int index = 0;
	
	private MyTreeNode CreateBiTree(MyTreeNode node) {

		index++;
		if(index >= arr.length || arr[index] == 0) {
			return new MyTreeNode(0);
		}
		
		MyTreeNode left = CreateBiTree(node);
		MyTreeNode right = CreateBiTree(node);

		return new MyTreeNode(arr[index], left, right);
		
	}
}

class MyTreeNode{
	

	MyTreeNode left;
	MyTreeNode right;
	Integer value;
	
	//建構子 : 每個TreeNode 都要有:
	MyTreeNode(int value,MyTreeNode left,MyTreeNode right){
		this.value = value;
        this.left = left;
        this.right = right;
	}
	
	public MyTreeNode(int value) {
		this(value,null,null);
	}
	
	@Override
	public String toString() {
		
		return value.toString();
	}
}
