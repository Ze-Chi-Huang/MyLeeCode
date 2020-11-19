package problems;

public class Q27 {

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3};
		removeElement(nums,2);
		for(int n : nums)
		{
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println(nums.length);

	}

	private static int removeElement(int[] nums, int val) {
		
		if(nums.length == 0) return 0;
		//思考 : 用兩個pointer 來處理同一個陣列的值!
		int newi = 0; //(修改的新的陣列指標
		
		for(int i=0; i<nums.length; i++) 
		{
			if(nums[i] != val)
			{
				nums[newi++] = nums[i];
			}
		}
		return newi;
		
	}

}
