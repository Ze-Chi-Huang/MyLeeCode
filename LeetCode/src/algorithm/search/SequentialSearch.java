package algorithm.search;

public class SequentialSearch {

	public static void main(String[] args) {
		
		int[] arr = {5,6,48,1,15,52,14,2,8,9};
		System.out.println(sequential_search(arr,5));//4
	}
	
	public static int sequential_search(int[] arr, int a) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == a) return i;
		}
		return -1;
		
	}

}
