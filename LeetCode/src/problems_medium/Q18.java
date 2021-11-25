package problems_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4 sum
public class Q18 {

	public static void main(String[] args) {
//		int[] nums = { 1, 0, -1, 0, -2, 2 };
//		int target = 0;

//		int[] nums = { 2,2,2,2,2 };
//		int target = 8;
		
//		int[] nums = { -2,-1,-1,1,1,2,2 };
//		int target = 0;
		
		int[] nums =  {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90};
		int target = 200;
		
		System.out.println(fourSum2(nums, target));
	}
	
	//改進寫法 (把重複的提前挑掉 (而不是加入後再剔除))
	public static List<List<Integer>> fourSum2(int[] nums, int target) {
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
		// 思考 : 改用排序過後的陣列，把重複的提前挑掉 (而不是加入後再剔除)
		int length = nums.length;
		Arrays.sort(nums);
		for(int a = 0; a < length - 3; a++) { //-3: 最後一定要保留四個數值
			if(a > 0 && nums[a] == nums[a-1] ) continue; //一定要取到a = length - 4 這個值，所以用nums[a-1]
			
			for(int b = a + 1; b < length - 2; b++) {
				if(b > (a + 1) && nums[b] == nums[b-1]) continue;
				
				for (int c = b + 1; c < length -1 ; c++) {
					if(c > (b + 1) &&  nums[c] == nums[c-1]) continue;
					
					for (int d = c + 1; d < length; d++) {
						if(d > (c + 1) &&  nums[d] == nums[d-1]) continue;
//						System.out.println(a + " " + b + " " + c + " " + d);
						if((nums[a] + nums[b] + nums[c] + nums[d]) == target) {
							List<Integer> list = Arrays.asList(new Integer[]{nums[a], nums[b], nums[c], nums[d]});
							answer.add(list);
						}
					}
				}
			}
		}

		return answer;
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
		// 思考 : 6選4去計算
		int length = nums.length;
		for (int a = 0; a < length; a++) {
			for (int b = a + 1; b < length; b++) {
				for (int c = b + 1; c < length; c++) {
					for (int d = c + 1; d < length; d++) {
//						System.out.println(a + " " + b + " " + c + " " + d);
						if((nums[a] + nums[b] + nums[c] + nums[d]) == target) {
							List<Integer> list = Arrays.asList(new Integer[]{nums[a], nums[b], nums[c], nums[d]});
							if(!contains(answer,list)) {
								answer.add(list);
							}
						}
						
					}
				}
			}
		}

		return answer;
	}

	private static boolean contains(List<List<Integer>> answers, List<Integer> list) {
		
		//四個元素都出現過(一一對應)就表示重複了
		for(List<Integer> answer : answers) {
			List<Integer> copy = new ArrayList<Integer>();
			copy.addAll(answer);
			
			for(Integer i : list) {
				if(copy.contains(i)) {
					copy.remove(i);
				}
			}
			
			if(copy.size() ==0 ) return true;
			
		}
		
		return false;
	}
}
