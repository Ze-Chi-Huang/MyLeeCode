package problems_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

//Q26 變形 : Remove Duplicates from Array
public class Q26_2 {

	public static void main(String[] args) {
		
		int[] nums = {1,3,2,4,3};
		nums = removeDuplicates(nums);
		for(int n : nums)
		{
			System.out.print(n + ", ");
		}
		System.out.println();
//		System.out.println(nums.length);
		
	}
	public static int[] removeDuplicates2(int[] A) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<A.length; i++) {
			if(!list.contains(A[i])) {
				list.add(A[i]);
			}
		}
		
		int[] B = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			B[i] = list.get(i);
		}
		
		return B;
    }
	
	public static int[] removeDuplicates(int[] A) {
		
		int[] B = new int[A.length];
		int j=0;
		
		for(int i=0; i<A.length; i++) {
			//新陣列沒找到就放值進去
			if(!search(B,A[i])) {
				B[j++] = A[i]; 
			}
			
		}
		
		//新的陣列
		int[] newB = new int[j];
		for(int i=0; i<j;i++) {
			newB[i] = B[i];
		}
		
		return newB;
    }
	
	
	private static boolean search(int[] b, int value) {
		
		for(int i=0;i<b.length;i++) {
			if(b[i] == value) return true;
		}
			
		return false;
	}
	

}
