package problems_medium;

import java.util.List;
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
/*
 * Constraints:
1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/

public class Q46 {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		Q46 q46 = new Q46();
		System.out.println(q46.permute(nums));
	}
	
    public List<List<Integer>> permute(int[] nums) {
    	//思考: 排列 -> 從第一個位置開始挑數字，剩下繼續挑
//    	for(int i=0; i<nums.length;i++) {
//    		
//    		//挑了一個
//    		nums[i]
//    	}
//    	
		return null;
    }
}
