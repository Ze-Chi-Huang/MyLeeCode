package problems_hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, 
//return the median of the two sorted arrays.
public class Q4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	int[] mergeArr = mergeArr(nums1,nums2);
    	
		return 0;
    }

	private int[] mergeArr(int[] nums1, int[] nums2) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i=0; i<nums1.length; i++) {
			//nums1[i]
			for(int j=0; j<nums2.length;j++) {
				
				//如果nums1[i] 比 nums2[j] 小，就比nums2[j+1]
				
			}
		}
		
		return null;
	}
    
}
