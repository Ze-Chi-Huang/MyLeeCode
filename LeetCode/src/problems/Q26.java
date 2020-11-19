package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove Duplicates from Sorted Array
public class Q26 {

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3};
		removeDuplicates2(nums);
		for(int n : nums)
		{
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.println(nums.length);
	}
	
	//思考 : 用兩個指針紀錄 新陣列 跟 原陣列 的位置
	public static int removeDuplicates2(int[] nums) {
        
		//把奇怪的nums剔除
		if(nums == null || nums.length == 0) return 0;
		int count = 1 ;//紀錄原陣列的指針，從1開始是因為第一個值絕對要保留
		for(int i=1; i<nums.length; i++)
		{
			if(nums[i-1] != nums[i]) 
			{
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
    }

	//自己做法 : 排序過的陣列，把第一個出現的值設為比較值，其他去比較，一樣就剔除，不一樣就是新的比較值
	public static int removeDuplicates(int[] nums) {
        
		if(nums.length ==0) return 0; //nums 為0則返回 0
		
		List<Integer> list = new ArrayList<Integer>();
		int comparator = nums[0] ;
		list.add(nums[0]); //第一個值務必加入
		
		// 思考 : 排序過的陣列，把第一個出現的值設為比較值，其他去比較，一樣就剔除，不一樣就是新的比較值
		for(int i=1; i<nums.length;i++)
		{
			
			if(comparator == nums[i]) 
			{
				continue;
				
			}else
			{
				comparator = nums[i];
				list.add(nums[i]);
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			
			nums[i] = list.get(i);
			
		}
		
		return list.size();
    }
}
