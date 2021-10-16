package algorithm.sort;

//每次都在未排序序列中尋找最小的元素放到第一個，直到排序完畢為止
public class SelectionSort {

	public static void main(String[] args) {
		
//		int[] arr = new int[] {5,6,1,15,84,19,48,2};
		int[] arr = new int[] {5,4,3,2,1};
		
		int[] arr_sorted = sort(arr);
		
		for(int x : arr_sorted) {
			System.out.print(x + " ");
		}

	}

	private static int[] sort(int[] arr) {
		
		//第n輪
		for(int n=0; n<arr.length; n++) {
			
			int min = arr[n]; //從起始開始
			for(int i=n; i<arr.length; i++) { //第n輪就表示前n個為已排序序列，i從n 開始即可
				
				if(arr[i] < min) {
					//swap
					min = arr[i];
					arr[i] = arr[n];
					arr[n] = min;
				}
				
			}
			
		}
		
		
		return arr;
		
	}
}
