package algorithm.sort;

//兩兩比較，比較小的就放前面，直到排序完成
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,6,1,15,84,19,48,2};
//		int[] arr = new int[] {5,4,3,2,1,2,3,4,5};
		
		int[] arr_sorted = sort(arr);
		
		for(int x : arr_sorted) {
			System.out.print(x + " ");
		}
		
	}

	//思考 : 第一輪比較 i-1 次，每次比較確保最後一個元素是最大的。比i-1次即可確認所有元素會由小排到大
	private static int[] sort(int[] arr) {
		
		for(int n=0; n< arr.length-1; n++) {
			
			for(int i=0; i < arr.length-1-n; i++) { //arr.length - 1 -n (n: 排了n次，就確定最後n個 已經是排好的序列，不用再排)
				
				if(arr[i] > arr[i+1]) {
					
					//swap
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				} 
				
			}
			
		}
		
		
		return arr;
	}

}
