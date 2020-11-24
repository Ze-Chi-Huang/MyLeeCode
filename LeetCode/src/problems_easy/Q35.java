package problems_easy;

public class Q35 {

	public static void main(String[] args) {
		int[] nums = {1};//sorted array
		
		System.out.println(searchInsert(nums, 2));
	}
	
	public static int searchInsert2(int[] nums, int target) {
		//思考 : 排序過，就二分搜尋法
		int start = 0;
		int end = nums.length -1;
		while(start + 1 < end){
			int mid = (end-start)/2 + start;
			if(target == nums[mid]) {
				return mid;
			}else if(target < nums[mid]) {
				end = mid;
			}else {
				start = mid;
			}
		}
		
		// 都沒有數值的狀況 : 
		if(target <= nums[start]) {
			return start;
		}else if(target <= nums[end]) {
			return end;
		}else {
			return end+1;
		}
	}
	
	//自己做
	public static int searchInsert(int[] nums, int target) {
		//思考 : 回傳他在的位置或要插入的區間 : 比i小&跟i 一樣大就回傳i ， 比i 大就繼續比
		
		if(nums.length == 0) return 0;
		
		for(int i=0; i<nums.length;i++) {
			if(target <= nums[i] ) {
				return i;
			}
		}
		
		return nums.length; //最末位
	}
}
