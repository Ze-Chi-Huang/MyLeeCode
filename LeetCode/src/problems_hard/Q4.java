package problems_hard;


//Given two sorted arrays nums1 and nums2 of size m and n respectively, 
//return the median of the two sorted arrays.
public class Q4 {
	
	public static void main(String[] args) {
		int[] nums1 = {1,3,4,8,12};
		int[] nums2 = {2,5,7,10};
		System.out.println(findMedianSortedArrays(nums1,nums2));
		
	}

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	//Step1 : 先合併
    	int[] mergeArr = mergeArr(nums1,nums2);
    	
    	//Step2 : 再找中位數
    	if(mergeArr.length %2 == 0) {
    		
    		return (mergeArr[mergeArr.length /2] + mergeArr[mergeArr.length /2 -1]) /2.0;
    		
    	}else {
    		return mergeArr[mergeArr.length/2];
    	}
    	
    }

	private static int[] mergeArr(int[] A, int[] B) {
		
		//思考 : 
		//1,2,4,8
		//3,5,7,10
		//可以用兩個指針，去比大小，誰小就放進去新的陣列
		int[] nums = new int[A.length + B.length];
		int i=0,j=0,k=0;
		
		while(i<A.length && j <B.length) {
			if(A[i] < B[j]) {
				
				nums[k] = A[i];
				i++;
				
			}else {
				nums[k] = B[j];
				j++;
			}
			k++;
		}
		
		//剩下的指針全寫入
		while(i<A.length) {
			nums[k] = A[i];
			k++;
			i++;
		}
		while(j<B.length) {
			nums[k] = B[j];
			k++;
			j++;
		}
		
		return nums;
	}
    
}
